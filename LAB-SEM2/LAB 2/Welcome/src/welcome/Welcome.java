/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ARUNMUGILAN S63746 //
package welcome;

public class Welcome {
    private String person_name;
    
    public Welcome(){
    System.out.println("CSF 3043 - Object Oriented Programming");
    }
    
    public Welcome(String person){
        setPerson_name(person);
    }
    
    public void setPerson_name(String person_name){
        this.person_name = person_name;
    }
    
    public String getPerson_name(){
        return (this.person_name);
    }
    
    public void DisplayMessage(){
        System.out.println("Welcome to OOP class, " + getPerson_name());
    }

    
}
    

