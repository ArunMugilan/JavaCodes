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
public class Person {
   private String First;
    private String Last;
    
    public Person(){
        
    }
    public Person (String first,String last){
        setFirst (first);
        setLast (last);
    }
    
    
    public String getFirst(){
        return (this.First);
    }
    public void setFirst(String first){
        this.First = first;
    }
    public String getLast(){
        return (this.Last);
    }
    public void setLast(String last){
        this.Last = last;
    }  
}
