/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:7
ACTIVITY:1(1)
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    	int number =10,positive =0,negative=0,total=0, loop=0;
    	
        System.out.print("Please enter a number " +(loop +1)+ ":");
        number = input.nextInt();
        
    	do
        {
			if(number>0)
        		positive++;
			else if(number < 0)      		
        		negative++;
                        
                        total += number;
                        loop++;
                        System.out.print("Please enter a number " +(loop +1)+ ":");
                        number = input.nextInt();
                        
                       
        }while(number !=0) ;
        
       
		
		System.out.println("positive number has been entered is  "+(int)positive+" times.");
		System.out.println("negative number has been entered is "+(int)negative+" times.");
                System.out.println("total number has been entered is "+(int)total );
                System.out.println("average value of the number  has been entered is "+(int)loop + ".");
                
    }
    
    
}
