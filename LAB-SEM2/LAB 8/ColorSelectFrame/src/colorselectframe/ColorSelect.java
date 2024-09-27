/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorselectframe;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
import javax.swing.JFrame;
public class ColorSelect {
    
    public static void main ( String args []){
        ColorSelectFrame colorSelectFrame = new ColorSelectFrame();
        colorSelectFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        colorSelectFrame.setSize (300, 125);
        colorSelectFrame.setVisible(true);
    }
}

