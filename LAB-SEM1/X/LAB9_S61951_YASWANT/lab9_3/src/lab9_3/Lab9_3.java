/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_3;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:9
ACTIVITY: 3
 */
import java.util.Scanner;
public class Lab9_3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      Scanner a = new Scanner (System.in);
       int num=0 ;
        System.out.print("Please enter an integer: ");
        int rows = a.nextInt();
        
        pattern(num);
       
    }
    public static void pattern(int num){
        int i,j,k, space = 0,val=1,rows = 0;
        
   System.out.print("Pattern I\n");
        
        for(i=0; i<rows; i++){ 
            num = 1 ;
            for(j=0; j<=i; j++){
                System.out.print(num++ + " ");
                num++; 
            }
            System.out.println();
        }
        System.out.print("\nPattern II\n");
        for(i=rows-1; i>=0; i--){ 
            num=1; 
            for(j=0; j<=i; j++){
                System.out.print(num++ + " ");
                num++; 
            }
            System.out.println();
        }
       
        System.out.println("\nPattern III");
        for (i = num - 1; i >= 0; i--) {

            for (k = i; k >= 1; k--) {

                System.out.print(num++ +"  ");
            }

            for (j = num - i; j >= 1; j--) {
                System.out.print(num++ +" " + j);
            }

            System.out.println();
        }

         System.out.print("\nPattern IV\n");
         for(i=1; i<=rows; i++){
             num = 1;
             for(j=1; j<=i; j++){
                 System.out.print("  ");
             }
             for(j=i; j<=rows; j++){
                 System.out.print(num++ +" ");
             }
             System.out.println();
         }
         
    }
}