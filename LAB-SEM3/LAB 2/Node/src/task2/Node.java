/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

public class Node {

    public char data1;
    Node next;
    
    public Node (){
        data1 = 'e';
        next = null;
    }
    public Node(char e, Node t){
        data1 = e;
        next = t;
    }
    
    public void printNode(){
        System.out.print("{"+ data1+"}"+"\n");
    }

    public Node getNext(){
    return this.next;
    }
    
    public void setNext(Node n){
    this.next = null;
    }
    
    public void printNode2(){
    System.out.print("{"+data1+"} ");
    }
    
}
