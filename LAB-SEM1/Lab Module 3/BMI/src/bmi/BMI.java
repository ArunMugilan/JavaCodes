/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class BMI {
    
    public static void main(String[] args) {
         double BMI;
        String weight = JOptionPane.showInputDialog("Enter your weight(kg) ");
        float dweight = Float.parseFloat(weight);
        String height = JOptionPane.showInputDialog("Enter your height(m)");
        float dheight = Float.parseFloat(height);
        BMI =  dweight / Math.pow(dheight, 2.0);
        BMI = Math.round(BMI * 10.0 ) / 10.0 ;
        JOptionPane.showMessageDialog(null, "Your BMI is :  " + BMI);
    }
    
}
