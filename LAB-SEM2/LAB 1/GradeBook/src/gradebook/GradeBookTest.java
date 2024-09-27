/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;



import java.util.Scanner;
public class GradeBookTest {

   public static void main (String[]args){
       Scanner a = new Scanner(System.in);
       
       GradeBook objGradeBook = new GradeBook();
       
       System.out.println("Please enter the course name :");
       String nameOfCourse = a.nextLine();
       System.out.println();
       
      objGradeBook.DisplayOutput( nameOfCourse);
   } 
}
    

