/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Shalini
 */
public class Business extends ExtPerson {
   
    public Business(String first, String last, int day, int mon, int year, String street, String city, String state, int zip, String categori, String phone) {
        super(first, last, day, mon, year, street, city, state, zip, categori = "Business Associate", phone);
    }
    
   public String Display(){
        return super.print();
    }  
}
