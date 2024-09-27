/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Act2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the sales value (RM) : ");
        double sales = a.nextDouble();
        double commission;
        if (sales <= 10000) {
            commission = sales*10/100;
        }
        else if (sales > 10000 && sales < 15000) {
            commission = sales *15/100;
        }
        else {
            commission = sales*20/100;
        }
        System.out.println("Your sales commission rate is RM" + commission);
    }
    
}
    
    

