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
        Scanner a = new Scanner(System.in);
        int students, i, best=0;
        int [] score;
        System.out.println("Enter the total number of students: ");
        students = a.nextInt();
        score = new int [students];
        System.out.println("Input the score");
        for(i=0; i<score.length; i++){
            System.out.println("Student " +i+ "'s score :");
            score[i]=a.nextInt();
            if (score[i]>best)
                best = score[i];
        }
        for (i=0; i<score.length; i++){
            if (score[i]>= best-10)
                System.out.println("Student " + i + " scored " + score[i] + ". The grade is A");
            else if (score[i]>= best-20)
                System.out.println("Student " + i + " scored " + score[i] + ". The grade is B");
            else if (score[i]>= best-30)
                System.out.println("Student " + i + " scored " + score[i] + ". The grade is C");
            else if (score[i]>= best-40)
                System.out.println("Student " + i + " scored " + score[i] + ". The grade is D");
            else
                System.out.println("Student " + i + " scored " + score[i] + ". The grade is F");
        }
        
    }
    
}
