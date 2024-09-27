/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2.pkg8;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:8
ACTIVITY: 2
 */
import java.util.Scanner;
public class Act28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("enter the number students: ");
      int a = in.nextInt();
      int[]scores = new int[a];
      
       System.out.println("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
         scores[i] = in.nextInt();  
        }
        int max = scores[0];
        for (int i = 0; i < scores.length; i++ ){
            if (max<scores[i]){
                max = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++ ){
            if (scores[i] >=max-10)
            {
                System.out.println("student "+(i)+ " score is " +scores[i]+ " Which is grade A.");
                
            }
            else if (scores[i] >=max-20)
            {
             System.out.println("student "+(i)+ " score is " +scores[i]+ " Which is grade B.");   
            }
            else if (scores[i] >=max-30)
            {
             System.out.println("student "+(i)+ " score is " +scores[i]+ " Which is grade C.");   
            }
            else if (scores[i] >=max-40)
            {
             System.out.println("student "+(i)+ " score is " +scores[i]+ " Which is grade D.");   
            }
            else 
            {
             System.out.println("student "+(i)+ " score is " +scores[i]+ " Which is grade F.");   
            }
        }
    }
    }
    
