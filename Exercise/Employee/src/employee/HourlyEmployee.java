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
public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    
    public HourlyEmployee(String first, String last, String ssn, double hours, double wage){
        super(first, last, ssn);
        setHourlyWage(wage);
        setHourlyWorked(hours);
    }

    public double getHours() {
        return hours;
    }

    public void setHourlyWorked(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHourlyWage(double wage) {
        this.wage = wage;
    }
    
    public double earnings(){
        if ( getHours() <= 40 ) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
    }
    
    public String toString(){
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "hourly wage", getWage(), 
         "hours worked", getHours() );
    }

    
}
