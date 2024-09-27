/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexperiment;


public class QueueExperiment {
    char q[];
    int front, rear, size;
    
    public QueueExperiment(int m){
        size = m;
        q = new char[size];
        front = rear = -1;
    }
    
    void enqueue(char n) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            q[rear] = n;
        }
    }
    
    char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (char) 250;
        } else {
            char x = q[front];
            front++;
            return x;
        }
    } 
	
	 
	char peek() { 
		return q[front]; 
	} 
	
	boolean isEmpty() { 
		return (front == -1 || front > rear);

	} 
	
	boolean isFull() {
		return (rear == size - 1);  

	}
        
        
        public static void main(String[] args){
            QueueExperiment myQueue = new QueueExperiment(10);
            myQueue.enqueue('a');
            myQueue.enqueue('b');
            myQueue.enqueue('c');
            myQueue.enqueue('d');
            myQueue.dequeue();
            myQueue.dequeue();
            myQueue.enqueue('e');
            myQueue.enqueue('f');
            myQueue.enqueue('g');
            myQueue.enqueue('h');
            myQueue.enqueue('i');
            myQueue.enqueue('j');
            myQueue.enqueue('k');
            myQueue.enqueue('l');
            
            System.out.println("\nElements from Queue :");
            System.out.println(myQueue.dequeue());
            while (!myQueue.isEmpty()) {
                System.out.println(myQueue.dequeue());						
	    }	
        }
}
    

