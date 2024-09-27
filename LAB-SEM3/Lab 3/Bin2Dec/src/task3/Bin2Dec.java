/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.*;
import java.util.regex.Pattern;

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
    }}

public class Bin2Dec {

    public static void main(String[] args) {
     IntStack s = new IntStack(25);
     int p=0, decNumber=0; 
     System.out.println(" Enter Boolean number (only consist of 1 and 0) :");  
     String binaryString = new Scanner(System.in).nextLine();   
     int Input = Integer.parseInt(binaryString); 
     String binaryPattern ="(1*0*)*";
     
     if(Pattern.compile(binaryPattern).matcher(binaryString).matches()){
         while(true){
             if (Input==0){
                 break;
             }else{
                 int temp = Input%10;
                 decNumber += temp*Math.pow(2,p);
                 Input = Input/10;
                 p++;
             }
         }
         
     System.out.println("Binary converted to Decimal is :");
     System.out.println(decNumber);
     }else{
         System.out.println("The given numbers are not in binary.Please use 1 or 0 only.");
     }
     
       
     }
    
}
