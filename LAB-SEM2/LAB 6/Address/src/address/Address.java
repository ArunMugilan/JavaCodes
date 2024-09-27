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
public class Address {
    private String Street;
    private String City;
    private String State;
    private int Zip;
    
    
    public Address(String street,String city,String state,int zip){
       setStreet ( street);
       setCity (city);
       setState (state);
       setZip  (zip);
    }
    

    public String getStreet(){
        return (this.Street);
    }
    public void setStreet(String street){
        this.Street = street;
    }
    public String getCity(){
        return (this.City);
    }
    public void setCity(String city){
        this.City = city;
    }
    public String getState(){
        return (this.State);
    }
    public void setState(String state){
        this.State = state;
    }
    public int getZip(){
        return (this.Zip);
    }
    public void setZip(int zip){
        this.Zip = zip;
    }
    
    
    public String toString(){
        return String.format("%s,%d %s,%s",getStreet(),getZip(),getCity(),getState() );
    }
    
    
}
