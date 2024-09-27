/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3.pattern;

/*AME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:7
ACTIVITY:3
 */
import java.util.Scanner;
public class Act3Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner a = new Scanner (System.in);
        int i,j,k;
        int num = 0;
        String Snum;
        int space = 0;
        int val=1;
        
        System.out.print("Please enter an integer: ");
        int rows = a.nextInt();
        System.out.print("Pattern I\n");
        
        for(i=0; i<rows; i++){ 
            num=1; 
            for(j=0; j<=i; j++){
                System.out.print(num+ " ");
                num++; 
            }
            System.out.println();
        }
        System.out.print("\nPattern II\n");
        for(i=rows-1; i>=0; i--){ 
            num=1; 
            for(j=0; j<=i; j++){
                System.out.print(num+ " ");
                num++; 
            }
            System.out.println();
        }
       
        System.out.println("\nPattern III");
        for (i = num - 1; i >= 0; i--) {

            for (k = i; k >= 1; k--) {

                System.out.print("  ");
            }

            for (j = num - i; j >= 1; j--) {
                System.out.print(" " + j);
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
