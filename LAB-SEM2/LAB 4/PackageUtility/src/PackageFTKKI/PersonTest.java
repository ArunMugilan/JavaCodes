/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageFTKKI;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */

import java.util.Scanner;
public class PersonTest {
    public static void main (String [] args){
        
        Scanner a = new Scanner(System.in);
        System.out.println("Your name please :");
        String name = a.next();
        System.out.println("Your birthday please (Month must 2 digit only) :");
        String dob = a.next();
        
        System.out.println(" ");
        
        Person obj1 = new Person (name,dob);
        
        
        
        
    }
    
}
