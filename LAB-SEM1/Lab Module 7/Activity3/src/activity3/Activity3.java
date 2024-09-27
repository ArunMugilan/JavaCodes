/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity3 {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i, j, k;
        int rows, num;
        String pattern = "";
        
        System.out.print("Enter the number of lines: ");
        rows = a.nextInt();        
       
        System.out.println("Pattern I");
        for ( i=1; i<=rows; i++){           
            for ( j=i; j>=i; j--){
                pattern = pattern + j + " ";
            }
            System.out.println(pattern);     
        }
        System.out.println("\nPattern II");
        for (i=rows; i>=1; i--){           
            pattern = "";
            for (j=1; j<=i; j++){
                pattern = pattern + j + " ";
            }
            System.out.println(pattern);     
        }
        System.out.println("\nPattern III");
        for ( i=1; i<=rows; i++){         
            pattern = "";
            for ( j=1; j<=rows-i; j++){
                pattern = pattern + "  ";
            }
            for ( k=i; k>0; k--){
                pattern = pattern + k + " ";
            }
            System.out.println(pattern);     
        }
        System.out.print("\nPattern IV\n");
         for(i=1; i<=rows; i++){
             num = 1;
             for(j=1; j<=i; j++){
                 System.out.print("  ");
             }
             for(j=i; j<=rows; j++){
                 System.out.print(num++ +" ");
             }
             System.out.println();     
        }
    }
    
}



   

        
       
    
    

