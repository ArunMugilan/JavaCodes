/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.IOException;

class ChrStack{
    private static final int defaultSize =10;
    private int size;
    private int top;
    private char[] stack;
    
    ChrStack(){
        size = defaultSize;
        top = -1;
        stack = new char[defaultSize];
    }
    
    ChrStack(int size){
        top = -1;
        this.size = size;
        stack = new char[size];
    }
    
    void push(char data){
        top++;
        stack[top]=data;
    }
    
    char pop(){
        char data = stack[top];
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


public class StackExperiment {

     public static void main (String[]arg) throws IOException{
         ChrStack s = new ChrStack(100);
         char ch;
         System.out.println("Please enter your name:");
         
         while((ch = (char) System.in.read())!= '\n'){
             if(!s.isFull()){
                 s.push(ch);
             }
         }
         
         System.out.println("your name reverse is: ");
         while(!s.isEmpty()){
             System.out.print(s.pop( ));
         }
     }
}
    
        
 
