/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ARUN MUGILAN A/L SARGUNAN S63746 //

package employee;

public class EmployeeTest {
    public static void main (String[] args){
        Date hire = new Date(01, 05, 2010);
        Employee objemployee = new Employee ("1005","Thomas Wu", hire);
        System.out.println(objemployee);
    }
    
}
