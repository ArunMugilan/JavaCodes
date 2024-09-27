/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/

import java.util.Scanner;

public class SavingsAccount { 
    public static void main(String[] args) {
       double Deposit;
       Scanner a = new Scanner(System.in);
       System.out.println("**********************************");
       System.out.println("MY SAVING FORECAST PROGRAM");
       System.out.println("**********************************");
       System.out.print("WHAT IS THE VALUE YOU WANT TO HAVE IN YOUR ACCOUNT? ");
       double value = a.nextDouble();
       System.out.print("HOW MANY YEARS YOU WANT THE MONEY TO SIT IN YOUR ACCOUNT? ");
       double years = a.nextDouble();
       System.out.print("WHAT IS THE ANNUAL INTEREST RATE (IN %)? " );
       double rate = a.nextDouble();
       
         double rate1 = rate / 100;
         double N;
         N = 1 + rate1;
         Deposit = value / Math.pow(N, years);
         System.out.print("THE AMOUNT YOU NEED TO DEPOSIT TODAY IS RM " + Deposit);
        
        }
}