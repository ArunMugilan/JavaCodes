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
public class Corporate extends Member{
    private String address;
    
    public Corporate(){
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public double computeDiscount(){
        return getFees()*0.2;
    }
    
    public double getExtraDiscount(){
        return getFees()*0.1;
    }
    
    public String toString(){
        return String.format(super.toString()+ "Address:%s\nDiscount:%.2f\nExtra Discount:%.2f\n", getAddress(), computeDiscount(), getExtraDiscount());
    }
    
}
