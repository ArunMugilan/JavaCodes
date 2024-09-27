/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pounds;

import java.util.Scanner;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:6
ACTIVITY: 2

 */
import java.util.Scanner;
public class Pounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kp =new Scanner(System.in);
        
        
       System.out.println("Kilogram\tPounds");
       double kg = 0;
       while (kg<200)
       {
           kg =kg +1;
           double pounds =kg*2.2;
           System.out.println(kg+"\t\t"+pounds);
           
           
             
    
   }   
}
}