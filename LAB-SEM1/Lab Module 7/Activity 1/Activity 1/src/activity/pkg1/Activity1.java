/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1;

/**
 *
 * @author USER
 */
/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity1 {

    
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
    	int number =10,positive =0,negative=0,total=0, loop=0;
    	
        System.out.print("Please enter a number " +(loop +1)+ ":");
        number = a.nextInt();
        
    	do
        {
            if(number>0)
                positive++;
            else if(number < 0)
                negative++;
            total += number;
            loop++;
            System.out.print("Please enter a number " +(loop +1)+ ":");
            number = a.nextInt();
        }
        while(number !=0) ;
        System.out.println("Number of positive number been entered is  "+(int)positive+" .");
        System.out.println("Number of negative number been entered is "+(int)negative+" .");
        System.out.println("Total number has been entered is "+(int)total );
        System.out.println("Average value of the number has been entered is "+(int)loop + ".");
    }
    
}
