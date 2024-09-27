/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateofbirth;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class DateOfBirth {

    
    public static void main(String[] args) {
        final int now = 2021;
        int age;
        String IC = JOptionPane.showInputDialog("Please enter your IC number ; ");
        String day = IC.substring(4, 6);
        String month = IC.substring(2, 4);
        String year = "20" + IC.substring(0, 2);
        age = now - Integer.parseInt(year);
        JOptionPane.showMessageDialog(null, "Your date of birth is " +day+"-"+month+"-"+year );
        JOptionPane.showMessageDialog(null, "Your age is " + age  );
    }
    
}
