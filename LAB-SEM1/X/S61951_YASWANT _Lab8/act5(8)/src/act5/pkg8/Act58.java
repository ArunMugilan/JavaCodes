/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5.pkg8;

import java.util.Scanner;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:8
ACTIVITY: 5
 */

import java.util.Scanner;
public class Act58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month[] = {"January","February", 
                          "Mac", "April", 
                          "May", "June", 
                          "July", "August", 
                          "September", "October", 
                          "November", "December"};
        double[][] temperature = new double[12][12];
        double thigh = 0,tlow = 0,hightempt = 0,lowtempt = 100;
        for (int i = 0; i < 12; i++) {

            System.out.println(" Enter temperature for :  " + month[i] );
           
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print(" Highest :");
                    temperature[i][j] = in.nextDouble();
                    thigh += temperature[i][j];
                    if (temperature[i][j] > hightempt) {
                        hightempt = temperature[i][j];
                    }
                } else {
                    System.out.print(" Lowest : ");
                    temperature[i][j] = in.nextDouble();
                    thigh += temperature[i][j];
                    if (temperature[i][j] < lowtempt) {
                        lowtempt = temperature[i][j];
                    }
                }
            }
         
        }
        double avehigh = thigh / 12;
        double avelow = thigh/ 12;

       
        System.out.println(" Average for high temperature on this year : " + avehigh);
        System.out.println(" Average for low temperature on this year :" + avelow);
        System.out.println(" Highest temperature on this year :" + hightempt);
        System.out.println(" Lowest temperature on this year : " + lowtempt);

    }

}
