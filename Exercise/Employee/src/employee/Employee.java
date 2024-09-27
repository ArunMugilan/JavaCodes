/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author USER
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public  Employee(String first, String last, String ssn){
        this.firstName=first;
        this.lastName=last;
        this.socialSecurityNumber=ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String toString(){
        return String.format("%s %s\nSocial Security Number:%s " + getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    public abstract double earnings;
    
    
    
}
