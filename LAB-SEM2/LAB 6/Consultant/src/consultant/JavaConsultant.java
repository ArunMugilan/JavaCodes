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
public class JavaConsultant extends Consultant {
    
    private int Day;
    private int Salary;
    
   
    public JavaConsultant(String name, String company, int age, int day, int salary){
        super(name, company, age);
        setDay(day);
        setSalary(salary);
    }
    
   
    public int getDay(){
        return(this.Day);
    }
    
    public void setDay(int day){
        this.Day=day;
    }
    
    public int getSalary(){
        return(this.Salary);
    }
    
    public void setSalary(int salary){
        this.Salary=salary;
    }
    
    
    public int calculateSalary(){
        int result= getDay() * getSalary();
        return result;
    }
    
    public void Display(){
        System.out.println("Your salary is : RM " +calculateSalary());
    }
}
