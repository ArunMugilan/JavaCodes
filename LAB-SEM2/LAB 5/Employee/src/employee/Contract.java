/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class Contract extends Employee {

    public Contract(int no, String name, String type, double salary, int hour) {
        super(no, name, type, salary, hour);
    }
    
    public void totalContract(){
        System.out.println(super.toString());
        System.out.printf("Total Salary for Contract Employee = RM %.1f\n", super.calculateContract());
    }
    
}
