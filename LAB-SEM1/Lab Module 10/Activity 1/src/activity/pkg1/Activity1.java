/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1;

import java.io.File;
import java.util.Date;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
public class Activity1 {

    
    public static void main(String[] args) {
        File file = new File ("Input.txt");
    System.out.println("Does it exist? " + file.exists());
    System.out.println("File length: " + file.length() + "byte");
    System.out.println("Can it be read? " + file.canRead());
    System.out.println("Can it be written? " + file.canWrite());
    System.out.println("Is it a directory? " + file.isDirectory());
    System.out.println("Is it a file? " + file.isFile());
    System.out.println("Is it absolute? " + file.isAbsolute());
    System.out.println("Is it hidden? " + file.isHidden());
    System.out.println("What is the path? " + file.getAbsolutePath());
    System.out.println("When is it last modified? " + new Date(file.lastModified()));
    System.out.println("Can it be renamed? " + file.renameTo(new File ("Input.txt")));
    }
    
}
