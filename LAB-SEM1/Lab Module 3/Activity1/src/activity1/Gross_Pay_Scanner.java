/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Gross_pay
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;

public class Gross_Pay_Scanner{ // Run manually
     public static void main(String[] args) {
         double grosspay; 
          Scanner a = new Scanner(System.in);
          System.out.println("Please Enter Your Name : ");
          String name = a.nextLine();
          
          System.out.println("Please Enter Total Worked Hours :");
          int hours = a.nextInt();
          
          System.out.println("Please Enter Total pay for an hour.");
          double pay = a.nextDouble();
          
          grosspay = pay * hours;
           System.out.println("Your name is :" + name + ". Your total gross pay is : RM " + grosspay);   
     }
   
    
    
    
}
