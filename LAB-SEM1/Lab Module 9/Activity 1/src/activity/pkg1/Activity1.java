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
public class Activity1 {

    
    public static void main(String[] args) {
        int x;
        double [] sales = {20000.30,15008.90,12584.10,87543.00,28791.30};
        double []ceil = new double [5];
        double []floor = new double [5];
        double []sr = new double [5];
        double []rad = new double [5];
        
  
    for (x = 0; x<sales.length; x++){
        ceil[x] = Math.ceil(sales[x]);
        floor[x] = Math.floor(sales[x]);
        sr[x] = Math.sqrt(sales[x]);
        sr[x]= Math.round(sr[x]/0.001)*0.001;
        rad[x] = Math.toRadians(sales[x]);
        rad[x]= Math.round(rad[x]/0.01)*0.01;
    }
    
    System.out.println("SALES"+ "\t\t" + "CEIL" + "\t\t" + "FLOOR" + "\t\t" + "SQUARE ROOT" + "\t" + "\t" + "RADIAN");
    for (x = 0; x<sales.length; x++){
        System.out.printf(sales[x] +"\t\t"+ceil[x] +"\t\t"+floor[x] +"\t\t"+sr[x] +"\t\t\t"+rad[x] + "\n" );
    }
    }
}
    

