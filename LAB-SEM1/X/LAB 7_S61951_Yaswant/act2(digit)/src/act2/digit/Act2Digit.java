/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2.digit;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:7
ACTIVITY:2
 */
import java.util.Scanner;
public class Act2Digit {

     public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int sum;
        String num;
        sum = 0;
        System.out.print("Enter an integer: ");
        num = a.nextLine();
        System.out.println("The individual digits of integer "+ num+ " is " +" ");
        for (int i = 0; i<num.length(); i++){
            System.out.print(num.charAt(i)+ "  ");
            sum = sum + Integer.parseInt(num.substring (i, (i+1)));
        }
        System.out.println("\nThe sum of integer " + num + " is : " + sum);
        }
        
    }