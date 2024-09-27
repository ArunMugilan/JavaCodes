/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import javax.swing.JOptionPane;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class DivisionTest {
    public static void main (String[] args){ 
   
    String input1, input2;
    int dividend, divisor, quotient;               
    
    input1 = JOptionPane.showInputDialog("Enter the dividend:");
    dividend =Integer.parseInt( input1);
    
    input2 = JOptionPane.showInputDialog("Enter the divisor:");        
    divisor = Integer.parseInt(input2);
     
    Division D1 = new Division(dividend,divisor);
    D1.getQuotient();
                 
    JOptionPane.showMessageDialog(null,"Dividend : "+dividend +"\nDivisor : "+divisor +"\nQuotient : "+D1.getQuotient());
  }
    
}
