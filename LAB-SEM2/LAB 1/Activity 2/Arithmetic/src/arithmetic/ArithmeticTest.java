/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ArithmeticTest {

    
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int number1;
        int number2;
        
        System.out.print("Enter first integer : ");
        number1 = a.nextInt();
        System.out.print("Enter second integer : ");
        number2 = a.nextInt();
        
        Arithmetic objArithmetic = new Arithmetic (number1, number2);
        
        System.out.printf("\nAddition is %d\n", objArithmetic.addition());
        System.out.printf("\nDifference is %d\n", objArithmetic.subtraction());
    }
    
    
}
