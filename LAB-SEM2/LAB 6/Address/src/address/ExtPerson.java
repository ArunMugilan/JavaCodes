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
public class ExtPerson extends Person {
    private Date Date;
    private Address Add;
    private String Categori;
    private String Phone;
    
    public ExtPerson (){
        
    }
    public ExtPerson(String first, String last, int day,int mon,int year ,
            String street,String city,String state,int zip,
            String categori,String phone) {
        
        super(first, last);
        Date = new Date(day,mon,year);
        Add = new Address(street,city,state,zip);
        setCato (categori);
        setPhone (phone);
    }
    
    //setter & getter...
    public void setPhone(String phone){
        this.Phone = phone;
    }
    public String getPhone(){
        return Phone;
    }
    
    public void setCato(String Cato){
        this.Categori = Cato;
    }
    public String getCato(){
        return Categori;
    }
    
    
    //Display
    public String print(){
        return String.format("%s%s %s\n%s%s\n%s%s\n%s%s\n%s%s",
        "Name          : ",super.getFirst(),super.getLast(),
        "Address       : ",Add.toString(),
        "Date of Birth : ",Date.toString(),
        "Category      : ",getCato(),
        "Phone No      : ",getPhone());
    }
}
