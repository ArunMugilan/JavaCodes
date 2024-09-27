/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ARUN MUGILAN S63746 //

package ticketsale;

import java.util.Scanner;
public class TicketSaleTest {
    public static void main(String[] args){
        
        Scanner a = new Scanner(System.in);
        double total;
        String A ,B ,C;
        TicketSale obj1 = new TicketSale();
        TicketSale obj2 = new TicketSale('A', 15.00);
        TicketSale obj3 = new TicketSale('B', 25.00); 
        TicketSale obj4 = new TicketSale('C', 30.00);
        
        System.out.print("Number of seats for " + obj2.getSeat() + " : ");
        A = a.next();
        obj2.setNum(Integer.parseInt(A));
        System.out.print("Number of seats for " + obj3.getSeat() + " : ");
        B = a.next();
        obj3.setNum(Integer.parseInt(B));
        System.out.print("Number of seats for " + obj4.getSeat() + " : ");
        C = a.next();
        obj4.setNum(Integer.parseInt(C));
        
        total = obj2.GetTotal()+obj3.GetTotal()+obj4.GetTotal();
        System.out.println ("The total sales is : RM"+total);
        
    }
    
}
