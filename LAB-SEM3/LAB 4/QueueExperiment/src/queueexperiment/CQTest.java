/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexperiment;

public class CQTest {
    public static void main(String[] args){
        CircularQueue<String> myQueue = new CircularQueue(8);
        myQueue.enqueue("Iltizam");
        myQueue.enqueue("Tekad");
        myQueue.enqueue("Rajin");
        myQueue.enqueue("Usaha");
        myQueue.enqueue("Berjaya");
        myQueue.enqueue("Konsisten");
        myQueue.enqueue("Yakin");
        myQueue.enqueue("Tabah");
        
        System.out.println ( "Full Circular Queue:\n" + myQueue);
        System.out.print ("\nDequeued following element from Circular Queue : ");
        System.out.print (myQueue.dequeue() + "    \n") ;
        System.out.println (myQueue); 
        myQueue.enqueue("Kuat");
        System.out.println ( "\nAfter enqueue circular Queue with element haveing value 23");
        System.out.println (myQueue); 	
    }
}
