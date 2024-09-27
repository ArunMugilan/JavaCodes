/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Act3 {

     
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String acctype = null;
	System.out.print("Key in  your account number : ");
	int acc = a.nextInt();
	System.out.print("Key in type of account(s or S for saving and c or C for checking) : ");
	char type = a.next().charAt(0);
	System.out.print("Key in your choosen minimum balance : ");
	double minimum = a.nextDouble();
	System.out.print("Key in  your current balance : ");
	double current = a.nextDouble();
        double balance = current;
        if(type =='s' || type =='S') {
            acctype = "Saving";
            if(current < minimum)
                balance -=10;
            else
                balance *= 1.04;
		}
        if(type =='c' || type =='C') {
            acctype = "Checking";
            if(current < minimum)
                balance -=25;
            else {
                if(minimum + 5000 < current)
                    balance *= 1.05;
                else
                    balance *= 1.03;
            }
        }
        balance = Math.round(balance*100.0)/100.0;
        System.out.println("Account number is "+ acc);
        System.out.println("Type is "+acctype);
        System.out.println("Current balance is RM"+current);
        System.out.println("New balance is RM"+balance);
    }
    
}
