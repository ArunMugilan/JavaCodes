/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class Contract extends Exercise3 {
    public Contract (int no, String name, String type, double salary, int hour  ){
        
        super (no, name, type, salary, hour);
    }
    
    public void totalContract(){
        System.out.println(super.toString());
        System.out.printf("Total Contract Employee = RM %.1f\n", super.calculateEmpSalaryContract());
    }
}
