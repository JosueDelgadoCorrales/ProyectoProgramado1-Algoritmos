/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramado1.algoritmos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class ProyectoProgramado1Algoritmos {

    static CircularLinkedList proceduresList = new CircularLinkedList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static void Menu() {
        Scanner menuOption = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Rellenar Lista");
        System.out.println("2. Mostrar Lista");
        System.out.println("3. Salir");

        int option = menuOption.nextInt();
        switch (option) {
            case 1:
                fillList();
                break;
            case 2:
                displayList();
                break;
            case 3:
                break;
        }
    }

    public static void fillList() {
        String filePath = 
                "C:\\Users\\josue\\OneDrive\\Documentos\\NetBeansProjects\\JavaServer\\src\\javaserver\\JavaServer.java";
        List<Procedure> procedures = JavaFileAnalyzer.analyzeFile(filePath);
        for (Procedure procedure : procedures) {
            proceduresList.add(procedure);
        }
        Menu();
    }

    public static void displayList() {
        proceduresList.display();
        Menu();
    }
}
