/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramado1.algoritmos;

/**
 *
 * @author josue
 */
public class Node {
    Procedure procedure;
    Node next;
    
    Node(Procedure procedure){
        this.procedure = procedure;
        this.next = null;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "procedure=" + procedure + ", next=" + next + '}';
    }


    
}
