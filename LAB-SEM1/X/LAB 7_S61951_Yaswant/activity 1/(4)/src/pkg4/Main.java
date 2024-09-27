/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:7
ACTIVITY:1(4)
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int year =1;
        double fee=4000; 
        double fee2 ;
        Scanner input = new Scanner(System.in);
         System.out.println("tuition fee for this year is RM4000. ");
         System.out.println("for your information , your tuition fee will increse by 5% every year.");
         
          fee2= (fee*1.05*10);
          System.out.println("tuition fee in the 10 years will be RM" +fee2);
        
          System.out.print("year\t\tTuition fee");
          do
          {
              fee=(fee *1.05);
              System.out.printf("\n%d\t\tRM%.2f ",year+1 ,fee);
              year= year+1 ;

          }while (year<=3);
           
    }
    
}