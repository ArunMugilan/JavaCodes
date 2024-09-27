/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg3;



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
public class Activity3 {

    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        try (Scanner inputFile = new Scanner(file)) {
            while (inputFile.hasNextLine()) {
                String one_by_one = inputFile.next();
                System.out.println(one_by_one);
            }
        }
    }
    
}
