/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestokm;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */

import java.util.Scanner;
public class MilesToKmTest {
    public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print ("Please insert the distance in miles : ");
        double miles = a.nextDouble();
        MilesToKm obj1 = new MilesToKm (miles);
        System.out.println(miles + " miles in kilometer is :  " +obj1.km() + "km");
    }
    
}
