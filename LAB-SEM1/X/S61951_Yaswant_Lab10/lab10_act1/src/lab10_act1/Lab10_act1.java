/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_act1;
import java.io.*;
import java.util.*;
/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:10
ACTIVITY:1
 */

public class Lab10_act1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        File file = new File ("input.txt");
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
    System.out.println("Can it be renamed? " + file.renameTo(new File ("rename.txt")));
    }
    
}
