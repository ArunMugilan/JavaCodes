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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Activity5 {

   
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("students.txt");
        try (Scanner a = new Scanner(file)) {
            PrintWriter result = new PrintWriter("result.txt");
            String[] name = new String[10];
            double[] mark = new double[10];
            char[] grade = new char[10];
            String tempName;
            char tempGrade;
            double total = 0.0, average, tempMark;
            int i = 0;
            while(a.hasNext()) {
                name[i] = a.next();
                mark[i] = a.nextDouble();
                grade[i] = a.next().charAt(0);
                i++;
            }
            
            for (int j = 0; j < mark.length; j++) {
                for (int k = j + 0; k < mark.length; k++) {
                    if (mark[j] < mark [k]) {
                        tempName = name[j];
                        name[j] = name [k];
                        name[k] = tempName;
                        
                        tempMark = mark[j];
                        mark[j] = mark[k];
                        mark[k] = tempMark;
                        
                        tempGrade = grade[j];
                        grade[j] = grade [k];
                        grade [k] = tempGrade;
                    }
                }
            }
            System.out.println("Name\t\tMark\tGrade");
            for (int j = 0; j < mark.length; j++) {
                System.out.println((j + 1) + ". " + name[j] + "\t" + mark[j] + "\t" + grade[j]);
                total += mark[j];
            }   
            
            average = total / mark.length;
            System.out.println("\nTotal Marks: " + total);
            System.out.println("Average Marks: " + average);
        }
        
    }
    
}

