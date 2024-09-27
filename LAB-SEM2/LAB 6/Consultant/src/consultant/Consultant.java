/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultant;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class Consultant {
    
    private String Name;
    private String Company;
    private int Age;
    
   
    public Consultant(String name, String company){
        setName(name);
        setCompany(company);
        Display();
    }
    
    public Consultant(String name, String company, int age){
        setName(name);
        setCompany(company);
        setAge(age);
        Display1();
    }
    
    
    public String getName(){
        return(this.Name);
    }
    
    public void setName(String name){
        this.Name=name;
    }
    
    public String getCompany(){
        return(this.Company);
    }
    
    public void setCompany(String company){
        this.Company=company;
    }
    
    public int getAge(){
        return(this.Age);
    }
    
    public void setAge(int age){
        this.Age=age;
    }
    
    public int calculateSalary(){
        return (0);
    }
    
    public void Display(){
        System.out.println("Name: " +getName());
        System.out.println("Company: " +getCompany());
    }
    
     public void Display1(){
        System.out.println("Name: " +getName());
        System.out.println("Company: " +getCompany());
        System.out.println("Age: "+getAge());
    }
     
}
