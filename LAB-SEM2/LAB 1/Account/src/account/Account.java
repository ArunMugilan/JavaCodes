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
public class Account {

    private String AccNo;
    private String AcctName;
    private final Double Balance;
    
    public Account (String Acct, String Name, Double balance){
    setAccNo(Acct);
    setAcctName(Name);
    this.Balance = balance;
    
    }
    public String getAccNo(){
        return(this.AccNo);
    }
    public void setAccNo(String AccNo){
        this.AccNo=AccNo;
    }
    public String getAcctName(){
        return (this.AcctName);
    }
    public void setAcctName (String AcctName){
        this.AcctName = AcctName;
    }
    public Double getBalance(){
        return (this.Balance);
    }
}
