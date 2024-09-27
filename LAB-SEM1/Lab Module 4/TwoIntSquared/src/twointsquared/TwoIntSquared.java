/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twointsquared;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Sum and Difference of 2 integers
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/

import java.util.Scanner;

public class TwoIntSquared {

    public static void main(String[] args) {
        double sum;
        double diff;
        double squared1;
        double squared2;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        double n1 = a.nextDouble();
        System.out.print("Enter second integer: ");
        double n2 = a.nextDouble();
        squared1 = Math.pow(n1, 2.0);
        squared2 = Math.pow(n2, 2.0);
        sum = squared1 + squared2;
        diff = squared1 - squared2;
        System.out.println("First integer squared : "+ squared1 );
        System.out.println("Second integer squared : "+ squared2); 
        System.out.println("Sum of both integers squared : "+ sum);
        System.out.println("Difference of both integers squared : "+ diff);
    }
    
}
