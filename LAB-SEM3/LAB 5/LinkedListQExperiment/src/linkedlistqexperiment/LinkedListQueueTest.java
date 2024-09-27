/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistqexperiment;


public class LinkedListQueueTest {
    public static void main (String[]args){
        LinkedListQueue myqueue = new LinkedListQueue();
        myqueue.insert(2);
        myqueue.insert(1);
        myqueue.insert(0);
        myqueue.insert(3);
        myqueue.insert(0);
        
        System.out.println("-- Displaying Queue data--");
        myqueue.displayList();
        
        System.out.println ("Item peeked- " + myqueue.peek()
        + "\n-- Removing Queue elements--"
        + "\nItem removed- " + myqueue.remove()
        + "\nItem removed- " + myqueue.remove());
    }
} 
    

