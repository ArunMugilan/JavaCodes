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
public class Activity5 {

    
    public static void main(String[] args) {
        double tax;
        System.out.println("Taxable Income\tSingle\t\tMarried Joint\tMarried Separate\tHead of a House");
        for(tax = 50000;tax <= 60000;tax += 50){
            System.out.println("RM " + Math.round(tax) +"\tRM " + Math.round(single(tax)) + "\t\tRM " + Math.round(married_joint(tax)) + "\t\tRM " + Math.round(married_seperate(tax)) + "\t\t\tRM " + Math.round(head(tax)));
        }
    }
    public static double single(double single){
        double odd = single * 0.17;
        return odd;
    }
    public static double married_joint(double MJ){
        double join = MJ * 0.15;
        return join; 
    }
    public static double married_seperate(double MS){
        double separate = MS * 0.18;
        return separate;
    }
    public static double head(double HOOH) {
        double head = HOOH * 0.16;
        return head;
    }
}
    

