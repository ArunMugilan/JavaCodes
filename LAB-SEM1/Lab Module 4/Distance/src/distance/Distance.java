/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class Distance {

    public static void main(String[] args) {
        String distance = JOptionPane.showInputDialog("Enter the distance(m) : ");
        String hours = JOptionPane.showInputDialog("Enter the hours : ");
        String mins = JOptionPane.showInputDialog("Enter the minutes : ");
        String sec = JOptionPane.showInputDialog("Enter the seconds : ");
        
        double time = Double.parseDouble(hours)*3600 + Double.parseDouble(mins)*60 + Double.parseDouble(sec);
        double MPS = Double.parseDouble(distance)/time;
        MPS = Math.round(MPS*100.0)/100.0;
        double KPH = (Double.parseDouble(distance)/1000) /(time/3600);
        KPH = Math.round(KPH*100.0)/100.0;
        double MPH = (Double.parseDouble(distance)/1609) /(time/3600);
        MPH = Math.round(MPH*100.0)/100.0;
        
        JOptionPane.showMessageDialog(null, "Speed in meter per second is : " + MPS);
        JOptionPane.showMessageDialog(null, "Speed in kilometer per hour is : " + KPH);
        JOptionPane.showMessageDialog(null, "Speed in miles per hour is : " + MPH);
  
        
    }
    
}
