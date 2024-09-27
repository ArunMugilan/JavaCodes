/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexperiment;

import java.util.Arrays; 
public class CircularQueue<E> {
        private int currentSize;  
	private E[] circularQueueElements; 
	private int maxSize; 				 
	
	private int rear;				 
	private int front; 				
        
        
	public CircularQueue(int maxSize) { 
	    this.maxSize= maxSize; 
	    circularQueueElements= (E[]) new Object[this.maxSize]; 
	    currentSize= 0; 
	    front= -1; 
	    rear= -1; 
	} 
	
	
	public void enqueue(E item) throws QueueFullException { 
	    if (isFull()) {
	    	throw new QueueFullException("Circlar Queue is full, Element cannot be added");
	    } else { 
	    	rear = (rear + 1) % circularQueueElements.length; 
	    	circularQueueElements[rear] = item; 
	    	currentSize++; 
	
	    	if (front == -1)  {
	    		front = rear; 
	    	}
	    }
	}
        
        public E dequeue() throws QueueEmptyException {
            E deQueuedElement;
            if (isEmpty()) {
                throw new QueueEmptyException("Circular Queue is empty. Element cannot be retrieved"); 
            } else {
                deQueuedElement = circularQueueElements[front];
                circularQueueElements[front] = null;
                front = (front + 1) % circularQueueElements.length;
                currentSize--; 
	    }
            return deQueuedElement; 
	}
	
	
	public boolean isFull() { 
		return (currentSize == circularQueueElements.length); 
	} 
	
	
	public boolean isEmpty() {
		return (currentSize == 0); 
	} 
	
	@Override
	public String toString() {
		return "Circular Queue (" + Arrays.toString(circularQueueElements) + ")";
	}
		

	
	
} 

class QueueFullException extends RuntimeException { 
	
	private static final long serialVersionUID = 1L; 
	
	public QueueFullException() {
		super(); 
	} 
	
	public QueueFullException(String message) {
		super(message); 
	}
}

class QueueEmptyException extends RuntimeException {
	
	private static final long serialVersionUID = 1L; 

	public QueueEmptyException() {
		super(); 
	} 
	
	public QueueEmptyException(String message) {
		super(message); 
	}
  
}
