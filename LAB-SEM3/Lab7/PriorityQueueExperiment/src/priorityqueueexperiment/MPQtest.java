/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexperiment;

/**
 *
 * @author USER
 */
public class MPQtest {
    public static void main (String[]args){
        MyPriorityQueue c = new MyPriorityQueue();
        c.enqueue(21);
        c.enqueue(11);
        c.enqueue(7);
        c.enqueue(15);
        c.enqueue(5);
        c.enqueue(9);
        c.enqueue(3);
        
        while(!c.isEmpty()){
            System.out.println(c.dequeue());
        }
    }
}
    

