/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionwithexception;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
import javax.swing.JOptionPane;
public class DivisionWithException {

    public static void main(String[] args) {
      boolean continueloop = true;
      int dividend, divisor, quotient;
      String input1 = null, input2;
       try{
           input1 = JOptionPane.showInputDialog("Enter the dividend:");
           dividend =Integer.parseInt( input1);
           
           input2 = JOptionPane.showInputDialog("Enter the divisor:");        
           divisor = Integer.parseInt(input2);
           
           Division D1 = new Division(dividend,divisor);
           D1.getQuotient();
           
           JOptionPane.showMessageDialog(null,"Dividend : "+dividend +"\nDivisor : "+divisor +"\nQuotient : "+D1.getQuotient());
       }
       
    catch(ArithmeticException e){
        JOptionPane.showMessageDialog(null,e);
   
    }
       
    catch(NumberFormatException f){
        JOptionPane.showMessageDialog(null, f);
     
    }
    System.exit(0);
    }
}