/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexperiment;

public class Factorial {
    public static int Factorial(int n) throws IllegalArgumentException{
        if (n<0){
            throw new IllegalArgumentException();
        } else if (n==0){
            return 1;
        } else {
            return n*Factorial(n-1);
        }
    }
    
    public static void main(String args[]){
        int f;
        int number=6;
        f=Factorial(number);
        System.out.println("Factorial of " + number + " is : "+f);
    }
    
}
