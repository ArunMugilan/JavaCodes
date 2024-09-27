/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overagefee;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;

public class OverageFee { 
    public static void main(String[] args) {
       double overageFee;
       Scanner a = new Scanner(System.in);
       System.out.println("**********************************");
       System.out.println("MY CELL PHONE OVERAGE FEE");
       System.out.println("**********************************");
       System.out.print("ENTER THE NUMBER OF EXCESS MINUTES: ");
       int excess = a.nextInt();
       overageFee = excess * 0.35;
       overageFee = Math.round(overageFee * 100.0 ) / 100.0 ;
       System.out.print("OVERAGE FEE = RM " + overageFee);
    }
    
}
