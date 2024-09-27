/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;



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
public class Activity2 {

    
    public static void main(String[] args) 
            throws Exception {
        
        first_way(); 
        second_way();
        third_way();
    }
    public static void first_way() {
        System.out.print("Applying the first way to read file named input.txt : ");
        for(int i = 0; i<9999999; i++){
            System.out.print("");
        }
        System.out.println("");
        
        try {
            File input_file = new File("input.txt");
            try(Scanner my_reader = new Scanner(input_file)) {
                while(my_reader.hasNext()) {
                    String data = my_reader.nextLine();
                    System.out.println(data);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured.");
        }
    }
    
    public static void second_way() 
            throws FileNotFoundException {
        System.out.print("\n");
        System.out.print("Applying the second way to read file named input.txt : ");
        for(int i = 0; i < 9999999; i++) {
            System.out.print("");
        }
        System.out.println("");
        
        Scanner a = new Scanner(new File("input.txt"));
        while(a.hasNext()) {
            String line = a.nextLine();
            System.out.println(line);
        }
    }
    public static void third_way() 
            throws FileNotFoundException {
        System.out.print("\n");
        System.out.print("Applying the third way to read file named input.txt : ");
        for(int i = 0; i < 9999999; i++) {
            System.out.print("");
        }
        System.out.println("");
        
        File file = new File("input.txt");
        try(Scanner input_file = new Scanner(file)) {
            while(input_file.hasNext()) {
                String line = input_file.nextLine();
                System.out.println(line);
            }
        }
    }
}
