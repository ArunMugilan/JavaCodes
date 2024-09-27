/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg4;



/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity4 {

    
    public static void main(String[] args) {
        int mark[] = new int[5];
        char grade[] = new char[5]; 
        int i,total = 0; 

        System.out.println("Key in your marks : "); 
  
        for(i = 0;i < 5;i++){
            System.out.print("Subject " + (i + 1) + " : ");
            mark[i] = read_Input();
            total += mark[i];
            grade[i] = identify_Grade(mark[i]);
        }
        for(i = 0;i < 5;i++) {
            System.out.println("\nGrade in subject " + (i+1) + " is " + grade[i]);
        }
        System.out.println("\nYour average score for 5 subjects is : " + calculate_Average(total));
    }
    public static int read_Input(){     
        Scanner a = new Scanner(System.in); 
        int score = a.nextInt(); 
        return score; 
    }
    public static char identify_Grade(int score){
        char ranking = ' ';
        if(score >= 80)
            ranking = 'A';
        else if(score >= 70 && score <=79)
            ranking = 'B';
        else if(score >= 50 && score <=69)
            ranking = 'C';
        else if(score >= 40 && score <=49)
            ranking = 'D';
        else
            ranking = 'F';
      return ranking;
    }
    
    public static int calculate_Average(int sum){
        return sum/5; 
    }
}
    

