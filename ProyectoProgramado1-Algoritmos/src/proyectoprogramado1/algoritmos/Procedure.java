/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramado1.algoritmos;

/**
 *
 * @author josue
 */
public class Procedure {

    private String name;
    private String complexity;

    public Procedure(String name, String complexity) {
        this.name = name;
        this.complexity = complexity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the complexity
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * @param complexity the complexity to set
     */
    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "Metodo: " + name + ", " + "Complejidad: " + complexity;
               
    }
    
    
}
