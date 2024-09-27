/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.number;



/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:6
ACTIVITY: 3
 */
import java.util.Scanner;
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1,num2,odd,even,x;
      System.out.println("First integer number must be less than second integer number ");
      Scanner input =new Scanner(System.in);
      System.out.print("please enter your first integer : ");
      num1= input.nextInt();
      System.out.print("please enter your second integer : ");
      num2= input.nextInt();
      
      while(num1>num2)
      {
        System.out.println("incorrect! please enter your integer again");  
        System.out.print("please enter your first integer : ");
        num1= input.nextInt();
        System.out.print("please enter your second integer : ");
        num2= input.nextInt();
          
      }
      x= num1;
       while(x<num2)
       {
        if (x %2 !=0)  
         System.out.println("odd number is : " +x); 
        x ++ ;
       }
        x= num1;
       while(x<num2)
       {
        if (x %2 ==0)  
         System.out.println("even number is : " +x); 
        x ++ ;
       }
  }
}
