/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_act4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:10
ACTIVITY:4
 */
public class Lab10_act4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws FileNotFoundException 
 {
  String name[] = new String[10],tempN; 
  double mark[] = new double[10],total = 0,tempM = 0; 
  char grade[] = new char[10],tempG; 
  int i = 0; 
  File file = new File("student.txt"); 
  Scanner input = new Scanner(file); 
                           
  while(input.hasNext()) 
  {
   name[i] = input.next(); 
   mark[i] = input.nextDouble();
   grade[i] = input.next().charAt(0); 
   total += mark[i]; 
   i++; 
  }
  
  input.close(); 
 
  for(int m = 0;m<9;m++) 
  {
   for(int n = (m + 1);n<10;n++) 
   {
    if (mark[n]>mark[m])
    {
  
     tempN = name[n]; 
     name[n]= name[m];
     name[m] = tempN; 
   
     tempM = mark[n]; 
     mark[n]= mark[m]; 
     mark[m] = tempM; 
     
     tempG = grade[n]; 
     grade[n]= grade[m];
     grade[m] = tempG; 
    }
   }
  }
 
  for(i = 0;i < 10 ;i++) 
   System.out.println(name[i] + " " + mark[i] + " " + grade[i]);
  
  System.out.println("\ntotal : " + total);
  System.out.println("average : " + (total/10)); 
 }
}