/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksales;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
import java.util.Scanner;
public class BookSalesTest {
    public static void main(String[] args){
     Scanner a = new Scanner(System.in);
        
        System.out.println("Type of books (A-Advance & B-Beginner ): ");
        String booktype = a.next();
        System.out.println("Do you have the membership card ? (Y/N)");
        String membership = a.next();
        System.out.println("Number of books to be purchased ");
        int quantity = a.nextInt();
        
        BookSales book = new BookSales(booktype,membership,quantity);
        
        book.DisplayPrice();   
    }
}
