/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author USER
 */
public class AccountTest {
    public static void main(String[]args){
       Account objAccount = new Account("1001", "Abdul Rahman", 1250.70);
       System.out.printf("\nAccount Number     :%s", objAccount.getAccNo());
       System.out.printf("\nAccount Name       :%s", objAccount.getAcctName());
       System.out.printf("\nBalance            :RM %.2f\n", objAccount.getBalance());
   } 
    
}
