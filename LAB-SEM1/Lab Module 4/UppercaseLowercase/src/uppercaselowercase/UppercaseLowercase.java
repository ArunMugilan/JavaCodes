/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppercaselowercase;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;
public class UppercaseLowercase {

    
    public static void main(String[] args) {
       String lower = JOptionPane.showInputDialog("What is your name (in lowercase)?");
       JOptionPane.showMessageDialog(null, lower.toUpperCase());
       String upper = JOptionPane.showInputDialog("What is your name (in uppercase)?");
       JOptionPane.showMessageDialog(null, upper.toLowerCase());
    }
    
}
