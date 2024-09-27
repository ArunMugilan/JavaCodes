/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_act2;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:10
ACTIVITY:2
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab10_act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
 {
  
  first_way(); 
  second_way(); 
  third_way(); 
 }
 
 public static void first_way()
 {
  System.out.print("getting the output from the first way to read datas from input.txt file line by line.....");
  for(int i = 0;i < 200000000;i++) 
  {
   System.out.print("");
  }
  System.out.println("");
  
  try
  {
   File my_object = new File("input.txt"); 
   try(Scanner my_reader = new Scanner(my_object)) 
   {
    while(my_reader.hasNext()) 
    {
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
 
 public static void second_way() throws FileNotFoundException
 {
  System.out.print("\n");
  System.out.print("getting the output from the second way to read datas from input.txt file line by line.....");
  for(int i = 0;i < 200000000;i++)
  {
   System.out.print("");
  }
  System.out.println("");
  
  Scanner in = new Scanner(new File("input.txt")); 
  while(in.hasNext())
  {
   String line = in.nextLine(); 
   System.out.println(line); 
  }
 }
 
 public static void third_way() throws FileNotFoundException
 {
  System.out.print("\n");
  System.out.print("getting the output from the third way to read datas from input.txt file line by line.....");
  for(int i = 0;i < 200000000;i++) 
  {
   System.out.print("");
  }
  System.out.println("");
  
  File file = new File("input.txt"); 
  try(Scanner input_file = new Scanner(file)) 
  {
   while(input_file.hasNext()) 
   {
    String line = input_file.nextLine(); 
    System.out.println(line);
   }
  }
 }
}