/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramado1.algoritmos;

/**
 *
 * @author josue
 */
public class CircularLinkedList {

    private Node head;
    private Node tail;

    public void add(Procedure procedure) {
        Node newNode = new Node(procedure);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;    
            
        }
    }
    
    public void display(){
        if(head != null){
            Node current = head;
            do{
                System.out.println(current.procedure);
                current = current.next;
            }while(current != head);
        }
    }

}
