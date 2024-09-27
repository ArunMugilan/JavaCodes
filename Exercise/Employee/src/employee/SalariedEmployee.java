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
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    public double earnings(){
        return getWeeklySalary();
    }
    
    public String toString(){
        return String.format("Salaried employee: %s\n%s: $%.2f", super.toString(), "Weekly salary: " , getWeeklySalary());
    }
    
}
