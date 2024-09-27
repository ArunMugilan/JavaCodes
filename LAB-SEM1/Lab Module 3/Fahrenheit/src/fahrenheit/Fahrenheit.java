/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class Fahrenheit {
    public static void main(String[] args) {
        double F;
        String celcius = JOptionPane.showInputDialog("Please Enter A Value for Celcius : ");
        float dcelcius = Float.parseFloat(celcius);
        F =  (dcelcius * 9/5) + 32;
        F = Math.round(F * 100.0 ) / 100.0 ;
        JOptionPane.showMessageDialog(null, "The value for Fahrenheit is :  " + F);
    }
    
}
