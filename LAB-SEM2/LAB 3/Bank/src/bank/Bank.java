/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class Bank {

    private int accNum;
    private String Name;
    private String Type;
    private String date;
    
    public Bank (int accNum, String Name){
        setAccNum(accNum);
        setName(Name);
        System.out.print("The transaction for account \""+getAccNum()+"\"");
        System.out.print(", account holder = \""+getName()+"\"");
    }
    
    public Bank (int accNum, String Name, String date){
        setAccNum(accNum);
        setName(Name);
        setDate(date);
        System.out.print("The transaction for account \""+getAccNum()+"\"");
        System.out.print(", account holder = \""+getName()+"\"");
        System.out.print(" and transaction date = \""+getDate()+"\"\n");
    }
    
    public void setAccNum (int accNum){
        this.accNum = accNum;
    }
     public void setName (String accName){
        this.Name = accName;
    }
      public void setDate(String date){
        this.date = date;
    }
      public int getAccNum(){
          return(this.accNum);
      }
      public String getName(){
          return(this.Name);
      }
      public String getDate(){
          return(this.date);
      }
    
}
