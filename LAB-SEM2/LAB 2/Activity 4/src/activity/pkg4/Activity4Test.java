/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ARUN MUGILAN A/L SARGUNAN S63746 //

package activity.pkg4;


import java.util.Scanner;
public class Activity4Test {
    public static void main (String[]args){
      Scanner input = new Scanner (System.in);
      System.out.print("Please insert the first number : ");   
      String num1 = input.nextLine();
      System.out.print("Please insert the second number : ");   
      String num2 = input.nextLine();
      Activity4 objActivity4 = new Activity4(num1,num2);
      objActivity4.getResult();
    }
}
