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
public class Individual extends Member{
    
    private String ssn;
    
    public Individual(){
        
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public double computeDiscount(){
        return super.getFees()*0.15;
    }
    
    public String toString(){
        return String.format(super.toString()+ "SSN:%s\nDiscount:%s\n", getSsn(), computeDiscount());
    }
    
}
