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
        Scanner a = new Scanner (System.in);
        int sum;
        String num;
        sum = 0;
        System.out.println("Enter an integer: ");
        num = a.nextLine();
        System.out.println("The individual digits of integer "+ num+ " is " +" ");
        for (int i = 0; i<num.length(); i++){
            System.out.println(num.charAt(i)+ "");
            sum = sum + Integer.parseInt(num.substring (i, (i+1)));
        }
        System.out.println("\nThe sum of integer " + num + " is : " + sum);
        }
        
    }
    

