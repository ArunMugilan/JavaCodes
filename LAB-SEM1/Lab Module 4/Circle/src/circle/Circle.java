/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Circles
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class Circle {

    public static void main(String[] args) {
        double diameter;
        double circumference;
        double area;
        double pi = 3.14159;
        String radius = JOptionPane.showInputDialog("Enter the radius of the circle : ");
        double dradius = Double.parseDouble(radius);
        diameter = dradius * 2.0;
        circumference= 2* pi* dradius;
        circumference=  Math.round(circumference * 100.0 ) / 100.0 ;
        area = pi * (dradius*dradius);
        area =  Math.round(area * 100.0 ) / 100.0 ;
        JOptionPane.showMessageDialog(null, "Diameter of circle is :  " + diameter);
        JOptionPane.showMessageDialog(null, "Circumference of circle is :  " + circumference);
        JOptionPane.showMessageDialog(null, "Area of circle is :  " + area);
        
    }
    
}
