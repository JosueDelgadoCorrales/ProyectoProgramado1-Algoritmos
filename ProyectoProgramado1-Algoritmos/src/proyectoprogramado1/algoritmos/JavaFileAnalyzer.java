/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramado1.algoritmos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class JavaFileAnalyzer {

    public static List<Procedure> analyzeFile(String filePath) {
        List<Procedure> procedures = new ArrayList();

        try ( BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder methodBuilder = null;
            String methodName = null;
            boolean insideMethod = false;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if ((line.startsWith("public") || line.startsWith("private")
                        || line.startsWith("protected")) && line.contains("(")
                        && line.contains(")") && line.endsWith("{")) {

                    if (insideMethod) {
                        procedures.add(new Procedure(methodName, calculateComplexity(methodBuilder.toString())));
                    }

                    methodName = extractMethodName(line);
                    methodBuilder = new StringBuilder();
                    insideMethod = true;
                }
                if (insideMethod) {
                    methodBuilder.append(line).append("\n");
                    if (line.endsWith("}")) {
                        procedures.add(new Procedure(methodName, calculateComplexity(methodBuilder.toString())));
                        insideMethod = false;
                    }
                }

            }
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return procedures;
    }

    private static String extractMethodName(String line) {
        String[] parts = line.split("\\s+");

        for (String part : parts) {
            if (part.contains("("))
            return part.substring(0, part.indexOf("("));
        }

        return "unknow";
    }

    private static String calculateComplexity(String method) {
        int loopForCount = method.split("for\\s*\\(").length - 1;
        int loopWhileCount = method.split("while\\s*\\(").length - 1;
        int loopDoWhileCount = method.split("do\\s*\\{").length - 1;
        int complexity = loopForCount + loopWhileCount + loopDoWhileCount;
        
        if(complexity == 0) return "O(1)";
        if(complexity == 1) return "O(n)";
        return "O(n^" + complexity + ")";
    }
}
