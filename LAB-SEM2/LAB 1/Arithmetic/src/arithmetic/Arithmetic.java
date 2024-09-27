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
public class Arithmetic {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int number1;
        int number2;
        
        System.out.print("Enter the first integer : ");
        number1 = a.nextInt();
        System.out.print("Enter the second integer : ");
        number2 = a.nextInt();
        
        if (number1 <0 || number2<0 ){
            number1=0;
            number2=0;
            System.out.println("Invalid entry of number....!");
        }
        
        System.out.printf("\nAddition is %d\n", (number1 + number2));
        System.out.printf("\nDifference is %d\n", (number1 - number2));
    }
}
    

