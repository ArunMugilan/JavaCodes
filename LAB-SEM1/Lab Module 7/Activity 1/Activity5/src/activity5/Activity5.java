/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity5;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : SUDOKU
 * Description : To demonstrate the simple Java Program
 * Date : 24 November 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Activity5 {

    public static void main(String[] args) {
        int unit,buildings=1,month,day=0,year=2021;
        do{
            unit=1;
            do{
                month=1;
                do{
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    switch(month){
                        case 1:System.out.println("Payment coupoun for January");
                        day=31;
                        break;
                        case 2: System.out.println("Payment coupoun for February");
                        day=28;
                        break;
                        case 3:System.out.println("Payment coupoun for March");
                        day =31;
                        break;
                        case 4:System.out.println("Payment coupoun for April");
                        day=30;
                        break;
                        case 5:System.out.println("Payment coupoun for May");
                        day=31;
                        break;
                        case 6:System.out.println("Payment coupoun for June");
                        day=30;
                        break;
                        case 7:System.out.println("Payment coupoun for July");
                        day=31;
                        break;
                        case 8:System.out.println("Payment coupoun for August");
                        day=31;
                        break;
                        case 9:System.out.println("Payment coupoun for September");
                        day=30;
                        break;
                        case 10:System.out.println("Payment coupoun for October");
                        day=31;
                        break;
                        case 11:System.out.println("Payment coupoun for November");
                        day=30;
                        break;
                        case 12:System.out.println("Payment coupoun for December");
                        day=31;
                        break;
                    }
                    System.out.printf("Building No: %d\t\tUnit No: %d",buildings,unit);
                    System.out.printf("\nAmount of Rent:RM800.00\nRent Due:%d/%d/%d\n",day,month,year);;
                    month++;
                }
                while (month<=12);
                unit++;
            }
            while (unit <=15);
            buildings++;
        }
        while(buildings<=20);
    }
}
