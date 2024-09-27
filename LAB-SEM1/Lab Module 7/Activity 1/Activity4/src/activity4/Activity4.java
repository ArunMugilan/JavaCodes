/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity4;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        int year =1;
        double fee=4000; 
        double totalFee ;
        Scanner input = new Scanner(System.in);
        System.out.println("Tuition fee for this year is RM4000. ");
        System.out.println("For your information , your tuition fee will increse by 5% every year.");
        totalFee= (fee + fee*1.05 + fee*1.05*1.05 + fee*1.05*1.05*1.05);
        System.out.println("Total cost of 4 years tuition fee will be RM" +totalFee);
        System.out.print("year\t\tTuition fee");
        do {
            fee=(fee *1.05);
            System.out.printf("\n%d\t\tRM%.2f ",year+1 ,fee);
            year= year+1 ;
        }
        while (year<=9);  
    }
    
}
