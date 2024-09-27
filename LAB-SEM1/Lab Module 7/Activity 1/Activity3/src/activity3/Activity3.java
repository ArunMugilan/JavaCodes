/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity3 {

    
    public static void main(String[] args) {
        int num1,num2,odd,even,x;
        System.out.println("First integer must be less than second integer. ");
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter your first integer : ");
        num1= input.nextInt();
        System.out.print("Please enter your second integer : ");
        num2= input.nextInt();
        
        while(num1>num2){
            System.out.println("incorrect! please enter your integer again");  
            System.out.print("Please enter your first integer : ");
            num1= input.nextInt();
            System.out.print("Please enter your second integer : ");
            num2= input.nextInt();
        }
        x= num1;
        do {
            if (x %2 !=0)
                System.out.println("odd number is : " +x);
            x++;
        }
        while(x<num2);
        x= num1;
        do {
            if (x %2 ==0)
                System.out.println("even number is : " +x);
            x++;
      }
        while(x<num2);
    }
}
