/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexperiment;


import java.util.NoSuchElementException;

public class MyPriorityQueue {
   private int[] innerArray;
   private int size;
   
   public MyPriorityQueue(){
       this.innerArray = new int[10];
       size =0;
   }
   
   public void enqueue(int x){
       if (size == 0){
           size++;
           innerArray[0]=x;
           return;
       }
       
       if (size()== innerArray.length){
           doubleArray();
       }
       
       
       int temp = x;
       for (int i =0; i<size; i++){
           
           if (x <= innerArray[i]){
           int next;
           temp = innerArray[i];
           innerArray[i]=x;
           
           while (i< size-1){
               next = innerArray[i+1];
               innerArray[i+1] = temp;
               temp = next;
               i++;
           }break;
       }
       }
       
       innerArray[size] = temp;
       size++;
   }
   
   public int dequeue(){
       
       if (isEmpty()){
           throw new NoSuchElementException("The queue is empty");
       }
       
       int retValue = innerArray[0];
       
       for (int i=1; i< size; i++){
         innerArray[i-1]= innerArray[i];  
       }
      innerArray[size - 1] = 0;
      size--;
      return retValue;
   }
   
   public int peek(){
    if (isEmpty()){
        throw new NoSuchElementException("The queue is empty");
    } 
    return innerArray[0];
   }
   
   public boolean contains(int x){
       
       if(isEmpty()){
           return false;
       }
       
       for (int i=0; i< size; i++){
           
           if (innerArray[i]== x){
               return true;
           }
        }
        return false;
    }
    
   public boolean isEmpty(){
       return size == 0;
   }
   
   public int size(){
       return size;
   }
   
   public void doubleArray(){
       int[] newArr = new int [innerArray.length *2];
       for(int i =0; i< innerArray.length; i++){
           newArr[i]= innerArray[i];
       }
       innerArray = newArr;
   }
   
}   

