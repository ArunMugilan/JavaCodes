/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class CreditCard {
    private int CCNum;
    private String Date;
    private String Description;
    private double Amount;
    
    //Define constructor
    public CreditCard (int ccnum, String date, String description, double amount){
        setCCNum(ccnum);
        setDate(date);
        setDescription(description);
        setAmount(amount);
    }
    
    
    public int getCCNum(){
        return(this.CCNum);
    }
    
    public void setCCNum(int ccnum){
        this.CCNum=ccnum;
    }
    
    public String getDate(){
        return(this.Date);
    }
    
    public void setDate(String date){
        this.Date= date;
    }
    
    public String getDescription(){
        return(this.Description);
    }
    
    public void setDescription(String description){
        this.Description=description;
    }
    
    public double getAmount(){
        return (this.Amount);
    }
    
    public void setAmount(double amount){
        this.Amount=amount;
    }
    
    public double CalculateAmount(){
        return (Amount);
    }
    
    public void Output(){
        System.out.println("Account Number: " +getCCNum());
        System.out.println("Transaction Date: " +getDate());
        System.out.println("Transaction Detail: " +getDescription());
        System.out.println("Payment Amount : RM" +CalculateAmount());
    }
}
