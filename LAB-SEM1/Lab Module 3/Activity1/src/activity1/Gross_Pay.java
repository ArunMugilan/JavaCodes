/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Gross_pay
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/

import javax.swing.JOptionPane;
        
public class Gross_Pay {

    public static void main(String[] args) {
        double grosspay;
        
         String name = JOptionPane.showInputDialog("Please Enter Your Name : ");
         String hours = JOptionPane.showInputDialog("Please Enter Total Worked Hours : ");
            int dhours = Integer.parseInt(hours);
                    String pay;  
        pay = JOptionPane.showInputDialog("Please Enter Total pay for an hour.");
        double dpay = Double.parseDouble(pay); 
        grosspay = dpay * dhours;
           JOptionPane.showMessageDialog(null, "Your name is : " + name
                   + ". Your total gross pay is : RM " + grosspay);
           }
    }       
             
         
        
       
    