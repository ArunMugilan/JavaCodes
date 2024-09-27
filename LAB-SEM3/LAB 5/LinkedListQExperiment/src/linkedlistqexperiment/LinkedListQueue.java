/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistqexperiment;

/**
 *
 * @author USER
 */
public class LinkedListQueue {
    Node front;
    Node rear;
    
    public LinkedListQueue(){
        front=null;
        rear=null;
    }
    
    private class Node{
        int i;
        Node next;
        
        Node(int i){
            this.i=i;
        }
        public void displayData(){
            System.out.println("i= " + i);
        }
    }
    
    public void insertLast(int i){
        Node newNode = new Node(i);
        if(isEmpty()){
            front=newNode;
        } else {
            rear.next= newNode;
        }
        rear = newNode;
    }
    public int removeFirst(){
        int temp = front.i;
        if (front.next==null){
            rear=null;
        }
        front = front.next;
        return temp;
    }
    public void displayList(){
        Node current = front;
        while (current!=null){
            current.displayData();
            current=current.next;
        }
    }

    public int nodeData(){
        return front.i;
    }
    public boolean isEmpty(){
        return front == null;
    }
    
    public void insert(int item){
        insertLast(item);
    }
    public int remove(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty...");
        }
        return removeFirst();
    }
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty...");
        }
        return nodeData();
    }
}  

