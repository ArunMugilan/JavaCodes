/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * Arun Mugilan A/L Sargunan S63746
 */
public class Permanent extends Employee {
    public Permanent (int No, String Name, String Type, double Salary, int Hours){
        super(No, Name, Type, Salary, Hours);
    }
    
    public void totalPermanent(){
        System.out.println(super.toString());
        System.out.printf("Total Salary for Permanent Employee = RM %.1f\n", super.calculatePermanent());
    }
    
}
