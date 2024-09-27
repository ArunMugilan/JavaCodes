/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.rent;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:6
ACTIVITY: 5
 */
import java.util.*;
public class Rent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unit,buildings=1,month,day=0,year=2021;
        while(buildings<=20){
            unit=1;
            while (unit <=15){
                month=1;
                while (month<=12){ 
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    switch(month){
                        case 1:System.out.println("payment coupun for January");
                        day=31;
                        break;
                        case 2: System.out.println("payment coupun for February");
                        day=28;
                        break;
                        case 3:System.out.println("payment coupun for March");
                        day =31;
                        break;
                        case 4:System.out.println("payment coupun for April");
                        day=30;
                        break;
                        case 5:System.out.println("payment coupun for May");
                        day=31;
                        break;
                        case 6:System.out.println("payment coupun for June");
                        day=30;
                        break;
                        case 7:System.out.println("payment coupun for July");
                        day=31;
                        break;
                        case 8:System.out.println("payment coupun for August");
                        day=31;
                        break;
                        case 9:System.out.println("payment coupun for September");
                        day=30;
                        break;
                        case 10:System.out.println("payment coupun for October");
                        day=31;
                        break;
                        case 11:System.out.println("payment coupun for November");
                        day=30;
                        break;
                        case 12:System.out.println("payment coupun for January");
                        day=31;
                        break;
                     
                    }
                    System.out.printf("Building No: %d\t\tUnit No: %d",buildings,unit);
                    System.out.printf("\nAmount of Rent:RM800.00\nRent Due:%d/%d/%d\n",day,month,year);;
                    month++;
                }
                unit++;
            }
            buildings++;
        }
    
    }
    
}
