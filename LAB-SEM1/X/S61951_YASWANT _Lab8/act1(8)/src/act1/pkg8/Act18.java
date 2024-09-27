/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1.pkg8;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:8
ACTIVITY: 1
 */
import java.util.Scanner;
public class Act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] element = new int[5];
        int maxValue = 0;

         System.out.println("key in 5 numbers : ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<element.length; i++) 
        {
            element[i] = in.nextInt();
        }

        for (int i = 0; i<element.length; i++) 
        {
            if (element[i]>maxValue)
            {
                maxValue = element[i];
            }
        }
       
        System.out.println(" Value in the array ");
        for (int i = 0; i<element.length; i++) 
        {
            System.out.print( element[i]+ " "  );
        }
        System.out.println("\nMaximum Value is " + maxValue);

    }

}