/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;
public class Act1 {

    
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Enter your IC number : ");
         long ic_num = Long.parseLong(input);
         String year = input.substring(0,2);
         String month = input.substring(2,4);
         String date = input.substring(4,6);
         int age;
         int birthyear;
         int y = Integer.parseInt(year);
         int now = 2022;
         if (y<20){ 
             birthyear =2000+y;
         }
         else{
           birthyear= 1900+y;
         }
         if (y<20){ 
             JOptionPane.showMessageDialog(null,"You born in 20th century");  
         }
        else{
             JOptionPane.showMessageDialog(null,"You born in 19th century");
         }  
         age = now - birthyear ;
         JOptionPane.showMessageDialog(null,"Your current age is " +age);
         JOptionPane.showMessageDialog(null,"Your birthdate is " + date + "-" + month + "-" + birthyear);
    }
}
    

