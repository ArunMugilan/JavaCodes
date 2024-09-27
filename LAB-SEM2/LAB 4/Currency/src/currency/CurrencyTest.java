/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
import java.util.Scanner;
public class CurrencyTest {
    
    public static void main (String[]args){
        Scanner a = new Scanner (System.in);
        System.out.print( "Please insert the currency in Malaysian Ringgit: ");
        double myr = a.nextDouble();
        Currency money = new Currency (myr);
        System.out.println("The currency in Pound Sterling is: "+money.sterling());
    }
}
