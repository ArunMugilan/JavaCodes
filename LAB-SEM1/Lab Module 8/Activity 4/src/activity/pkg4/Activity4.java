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
public class Activity4 {

    
    public static void main(String[] args) {
        int i, j;
        int score[][] = {{1, 78, 90, 40, 75}, 
                        {2, 90, 83, 75, 68}, 
                        {3, 40, 80, 53, 69}, 
                        {4, 75, 80, 98, 95}, 
                        {5, 64, 50, 41, 70}};
        
        
        int[] total = new int[5];
        System.out.println(" ");
        for (i = 0; i < 5; i++) {
            System.out.println(" Student ID :" + score[i][0]);
            System.out.println(" Mark 1 :" + score[i][1]);
            System.out.println(" Mark 2 :" + score[i][2]);
            System.out.println(" Mark 3 :" + score[i][3]);
            System.out.println(" Mark 4 :" + score[i][4]);
            System.out.println(" ");
        }
        for (i = 0; i < 5; i++){
            for (j = i; j < 5; j++){
                total[i] += score[i][j];
            }
        }
        for (j = 0; j < 5; j++){
            System.out.println(" Student " + score[j][0] + " total marks is " + total[j]);
        }
        
    }
    
}
