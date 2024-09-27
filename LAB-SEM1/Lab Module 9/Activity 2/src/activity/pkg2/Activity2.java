/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;



/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/

public class Activity2 {

    
    public static void main(String[] args) {
        
        System.out.println("Miles/h" +"\t\t"+ "Km/h");
        calculate_kilometre();
        }
    
    public static void calculate_kilometre(){
    double mile, km;
        
        for(mile=60;mile<=130;mile+=10){
            km = mile/0.6214;
            km= Math.round(km/0.01)*0.01;
            System.out.printf(mile+ "\t\t"+ km +"\n");
        }
    }
}
    
        
    

