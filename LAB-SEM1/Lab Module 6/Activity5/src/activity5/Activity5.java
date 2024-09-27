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
public class Activity5 {

    
    public static void main(String[] args) {
        int unit,buildings=1,month,day=0,year=2021;
        while(buildings<=20){
            unit=1;
            while (unit <=15){
                month=1;
                while (month<=12){ 
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    switch(month){
                        case 1:System.out.println("Payment coupon for January");
                        day=31;
                        break;
                        case 2: System.out.println("Payment coupon for February");
                        day=28;
                        break;
                        case 3:System.out.println("Payment coupon for March");
                        day =31;
                        break;
                        case 4:System.out.println("Payment coupon for April");
                        day=30;
                        break;
                        case 5:System.out.println("Payment coupon for May");
                        day=31;
                        break;
                        case 6:System.out.println("Payment coupon for June");
                        day=30;
                        break;
                        case 7:System.out.println("Payment coupon for July");
                        day=31;
                        break;
                        case 8:System.out.println("Payment coupon for August");
                        day=31;
                        break;
                        case 9:System.out.println("Payment coupon for September");
                        day=30;
                        break;
                        case 10:System.out.println("Payment coupon for October");
                        day=31;
                        break;
                        case 11:System.out.println("Payment coupon for November");
                        day=30;
                        break;
                        case 12:System.out.println("Payment coupon for December");
                        day=31;
                        break;
                     
                    }
                    System.out.printf("Building No: %d\t\tUnit No: %d",buildings,unit);
                    System.out.printf("\nAmount of Rent:RM800.00\nRent Due:%d/%d/%d\n",day,month,year);
                    month++;
                }
                unit++;
            }
            buildings++;
        }
    }
    
}
