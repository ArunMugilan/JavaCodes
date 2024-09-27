/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.IOException;
import java.util.*;

class IntStack{
    private static final int defaultSize =10;
    private int size;
    private int top;
    private int[] stack;
    
    IntStack(){
        size = defaultSize;
        top = -1;
        stack = new int[defaultSize];
    }
    
    IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int[size];
    }
    
    void push(int data){
        top++;
        stack[top]=data;
    }
    
    int pop(){
        int data = stack[top];
        top--;
        return data;
    }
    
    boolean isEmpty(){
        return(top==-1);
    }
    
    boolean isFull(){
        return(top == size-1);
    }
    
    int length(){
      return top;  
    }
}

public class Dec2Bin {
    public static void main(String[] args) throws IOException {
        IntStack s = new IntStack(25);
        int decNumber=0, p=0;
        boolean stop = false;
        
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter Decimal Number :");
         try{
             decNumber = Input.nextInt();
             p= decNumber;
         }
         catch(InputMismatchException e){
          System.out.println("Something went wrong!");}
         while(stop != true && decNumber>0){
         if(!s.isFull()){
         s.push(decNumber %2); 
         decNumber = decNumber/2;
         }
     }
        System.out.println(p + " is converted into binary: ");
         while(!s.isEmpty()){
             System.out.print(s.pop( )+"");
         }
    }
    
}
