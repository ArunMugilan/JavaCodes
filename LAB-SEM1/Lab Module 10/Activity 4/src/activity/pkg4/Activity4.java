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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Activity4 {

    
    public static void main(String[] args) 
            throws FileNotFoundException {
        String name[] = new String[10],tempN;
        double mark[] = new double[10],total = 0,tempM = 0;
        char grade[] = new char[10],tempG;
        int i = 0;
        File file = new File("students.txt");
        try (Scanner a = new Scanner(file)) {
            while(a.hasNext()) {
                name[i] = a.next();
                mark[i] = a.nextDouble();
                grade[i] = a.next().charAt(0);
                total += mark[i];
                i++;
            }
        }
        
        for(int j = 0;j<9;j++) {
            for(int k = (j + 1);k<10;k++) {
                if (mark[k]>mark[j]) {
                    tempN = name[k];
                    name[k]= name[j];
                    name[j] = tempN;
                    
                    tempM = mark[k];
                    mark[k]= mark[j];
                    mark[j] = tempM;
                    
                    tempG = grade[k];
                    grade[k]= grade[j];
                    grade[j] = tempG;
                }
            }
        }
        
        for(i = 0;i < 10 ;i++)
            System.out.println(name[i] + " " + mark[i] + " " + grade[i]);
        System.out.println("\nTotal marks : " + total);
        System.out.println("Average mark : " + (total/10));
    }
    
}
