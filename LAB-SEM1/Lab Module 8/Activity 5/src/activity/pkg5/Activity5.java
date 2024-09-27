/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg5;



/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity5 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month[] = {"January","February", 
                          "Mac", "April", 
                          "May", "June", 
                          "July", "August", 
                          "September", "October", 
                          "November", "December"};
        double[][] temperature = new double[12][12];
        double highTemp = 0,lowTemp = 0,high = 0,low = 100;
        double highAV, lowAV;
        for (int i = 0; i < 12; i++) {

            System.out.println("Enter temperature for : " + month[i] );
           
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Highest : ");
                    temperature[i][j] = in.nextDouble();
                    highTemp += temperature[i][j];
                    if (temperature[i][j] > high) {
                        high = temperature[i][j];
                    }
                } else {
                    System.out.print("Lowest : ");
                    temperature[i][j] = in.nextDouble();
                    lowTemp += temperature[i][j];
                    if (temperature[i][j] < low) {
                        low = temperature[i][j];
                    }
                }
            }
         
        }
        highAV = highTemp / 12;
        lowAV = lowTemp / 12;

       
        System.out.println("\nAverage for high temperature on this year : " + highAV);
        System.out.println("Average for low temperature on this year :" + lowAV);
        System.out.println("Highest temperature on this year :" + high);
        System.out.println("Lowest temperature on this year : " + low);
    }
    
}
