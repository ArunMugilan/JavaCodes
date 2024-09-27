/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member;

/**
 *
 * @author USER
 */
public class Member {
    
   private String Name;
   private String Phone;
   private double fees;
   
   public Member(){
       
   }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
   
    public String toString(){
        return String.format(getClass().getSimpleName()+"\nName :%s\nPhone No :%s\nAmount :%.2f\n"
                ,getName(),getPhone(),getFees());
    }
    
}
