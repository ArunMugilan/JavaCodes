/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity2 {

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Kilogram\tPounds");
        double kg = 0;
        do{
            kg =kg +1;
            double pounds =kg*2.2;
            pounds = Math.round(pounds*100.0)/100.0;
            System.out.println(kg+"\t\t"+pounds);
         }
        while (kg<200);
       }
    }
