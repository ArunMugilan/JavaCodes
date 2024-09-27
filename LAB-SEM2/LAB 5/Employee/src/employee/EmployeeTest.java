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
public class EmployeeTest {
    public static void main(String[] args){
        Permanent P1 = new Permanent(1234, "Ahmad", "Permanent", 1000, 0);
        P1.totalPermanent();
        
        System.out.println(" ");
        
        Contract C1 = new Contract(2, "Ali", "Contract", 0, 12);
        C1.totalContract();
    }
    
}
