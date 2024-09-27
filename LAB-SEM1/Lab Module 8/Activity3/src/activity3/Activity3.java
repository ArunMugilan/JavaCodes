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
public class Activity3 {

    
    public static void main(String[] args) {
        double[]alpha=new double [50];
        int total = 0;int sum = 0;
        for (int index=0; index<25; index++){
            alpha[index]= Math.pow(index, 2);
        }
        for (int index=25; index<alpha.length; index++)
            alpha[index]= Math.pow(index, 3);
        for(int index=1; index<alpha.length; index++){
            System.out.printf("%.2f\t", alpha[index-1]);
            if(index%10 ==0 && index !=0)
                System.out.println("\n");
        }
        for(int index=1; index<alpha.length; index++){
            
            sum += alpha[index];
        }
        double average = sum/alpha.length;
        System.out.println("\n\nAverage : "+average);
        
        
    }
    
}
