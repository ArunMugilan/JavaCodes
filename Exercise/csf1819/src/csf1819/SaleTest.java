/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csf1819;

import java.util.Scanner;


public class SaleTest {
    public static void main(String[] args){
        Sale s1 = new Sale(15);
        Scanner a = new Scanner(System.in);
        System.out.print("Your name: ");
        String name=a.next();
        s1.setName(name);
        System.out.print("How many books? ");
        int x = a.nextInt();
        s1.setQuantity(x);
        System.out.print("Type of customer? (NC/S/M) ");
        String w = a.next();
        s1.typeOfCustomer(w);
        s1.priceBefore();
        s1.priceAfter();
        System.out.println("\n\nName: " + name + "\nPrice before the discount: RM "+ s1.priceBefore()+"\nQuantity of books bought: "+ s1.setQuantity(x)+"\nTotal order price after discount: RM"+s1.priceAfter());
        
    }
    
}
