/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

import javax.swing.JOptionPane;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */

public class Activity3Test {
    public static void main(String[] args) {
        boolean continueloop = true;
        String input;
        int dividend, divisor ;                    
        int quotient;                 
        
        try{
            input = JOptionPane.showInputDialog("Enter the dividend:");
            dividend =Integer.parseInt( input);
    
            input = JOptionPane.showInputDialog("Enter the divisor:");      
            divisor = Integer.parseInt(input);
        
            if(divisor==0) throw new OwnException();
            quotient = dividend / divisor ;

            JOptionPane.showMessageDialog(null,"Dividend : "+dividend +"\nDivisor : "+divisor +"\nQuotient : "+quotient);
        }
        
        catch (OwnException e ){
            JOptionPane.showMessageDialog(null,"Exception"+e+"\nInvalid Divisor", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
