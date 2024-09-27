/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageFTKKI;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
import java.util.Date;
public class Person {
    private String Name;
    private Date Dob;
    
    Date obj1 = new Date();
    
    public Person(String name,String dob){    
    setName(name);
    
    System.out.print("Name :"+getName());
       System.out.print("\nBirth Date :" + getDOB());
       obj1.equals(dob);
}
    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setDOB(Date dob){
        this.Dob=dob;
    }
    public Date getDOB(){
        return Dob;
    }  
}
