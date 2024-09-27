/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1;

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
        int [] element = new int [5];
        int i, max = 0;
        int sum=0;
        System.out.println("Please input 5 integers.");
        for ( i=0; i<element.length; i++)
            element[i]= a.nextInt();
        for ( i=0; i<element.length; i++)
            if (element [i]> max)
                max = element[i];
        System.out.println("\nValues in the array :");
        for ( i=0; i<element.length; i++)
            System.out.println(element[i]+ " ");
        System.out.println("\nMaximum Value is "+ max);
        for ( i=0; i<element.length; i++){
            sum += element [i];
        }
            double average = sum /element.length;
            System.out.println("Average: "+ average);
                    
        
    }
    
}
