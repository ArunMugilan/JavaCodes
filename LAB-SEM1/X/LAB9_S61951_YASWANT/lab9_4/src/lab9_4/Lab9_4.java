/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_4;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:9
ACTIVITY: 4
 */
import java.util.Scanner;
public class Lab9_4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
  int mark[] = new int[5]; 
  char grade[] = new char[5]; 
  int i,total = 0; 
  System.out.println("key in your marks : "); 
  for(i = 0;i < 5;i++)
  {
   System.out.print("Subject " + (i + 1) + " : ");
   mark[i] = read_Input(); 
   total += mark[i]; 
   grade[i] = identify_Grade(mark[i]); 
  }                        
  
  System.out.println("\nrades of the subjects :");
  for(i = 0;i < 5;i++)
  {
   System.out.println("subject " + (i + 1) + " : " + grade[i]);
  }
  
  System.out.println("\nyour average mark for overall five subjects : " + calculate_Average(total));
 }

 public static int read_Input(){              
  Scanner input = new Scanner(System.in); 
  int score = input.nextInt(); 
  
  return score; 
 }

 public static char identify_Grade(int score){                
  char ranking = ' ';
  
  if(score >= 80)
   ranking = 'A';
  else if(score >= 70 && score <=79)
   ranking = 'B';
  else if(score >= 50 && score <=69)
   ranking = 'C';
  else if(score >= 40 && score <=49)
   ranking = 'D';
  else
   ranking = 'F';
      
  return ranking; 
 }

 public static int calculate_Average(int sum){               
  return sum/5; 
 }
}
