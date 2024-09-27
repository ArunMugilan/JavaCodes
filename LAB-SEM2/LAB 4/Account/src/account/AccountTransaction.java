/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class AccountTransaction {
    public static void main (String[]args){
        Account account1 = new Account ("Ali", "W", 400.00);
        account1.displayBalance();
        Account account2 = new Account ("Ali", "D", 100.00);
        account2.displayBalance();
        Account account3 = new Account ("Ali", "W", 600.00);
        account3.displayBalance();
    }
    
}
