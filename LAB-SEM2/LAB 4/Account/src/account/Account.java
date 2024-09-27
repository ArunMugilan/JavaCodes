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
public class Account {
    private static int transactionNo;
    private String PersonInCharge;
    private String Transactiontype;
    private double withdraw;
    private double debit;
    
    private static double balance = 1000.00;
    private static int transaction = 0;
    
    
    public Account(){}
    
    public Account (String PersonInCharge, String transaction, double amount){
        transactionNo++;
        setPersonInCharge(PersonInCharge);
        setTransactiontype(transaction);
    
        if(getTransactiontype().equals("D")){
            setBalance( getBalance()+amount);
        }
        
        else if (getTransactiontype().equals("W")){
            setBalance( getBalance()-amount);
        }
    }
    
    public String getPersonInCharge(){
        return (this.PersonInCharge);
    }
    
    public void setPersonInCharge(String PersonInCharge){
        this.PersonInCharge = PersonInCharge;
    }
    
    public String getTransactiontype(){
        return (this.Transactiontype);
    }
    
    public void setTransactiontype(String Transactiontype){
        this.Transactiontype = Transactiontype;
    }
    
    public static double getBalance(){
        return (Account.balance);
    }
    
    public static void setBalance(double balance){
        Account.balance = balance;
    }
    
    public static int gettransactionNo(){
        return (Account.transactionNo);
    }
    
    public static void settransactionNo(int transactionNo){
        Account.transactionNo = transactionNo;
    }
    
    public void displayBalance(){
        System.out.println("----------------------------------");
        System.out.printf("Person In-Charge = %s\n", getPersonInCharge());
        System.out.printf("Transaction No = %d\n", gettransactionNo());
        System.out.printf("Current balance = %.2f\n", getBalance());
        System.out.println("             ");
    }
}
