5/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;

public class Statistics {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double mean;
        double variance;
        double SD;
        System.out.print("Enter first value : ");
        double x1 = a.nextDouble();
        System.out.print("Enter second value : ");
        double x2 = a.nextDouble();
        System.out.print("Enter third value : ");
        double x3 = a.nextDouble();
        
        mean = (x1+x2+x3)/3;
        variance = ((x1*x1+x2*x2+x3*x3)/3) - (mean*mean);
        variance = Math.round(variance * 100.0 )/100.0;
        SD= Math.sqrt(variance);
        SD = Math.round(SD * 100.0 )/100.0;
        
        System.out.println("a) "+ mean);
        System.out.println("b) "+ variance);
        System.out.println("c) "+ SD);
                
    }
    
}
