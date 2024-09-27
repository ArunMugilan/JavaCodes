/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertframe;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JTextField temperatureF;
    
    public ConvertFrame(){
        super( "Temperature converter");
        label1 = new JLabel ("Enter Fahrenheit temperature : ");
        temperatureF = new JTextField (10);
        
    temperatureF.addActionListener(
    new ActionListener(){
        public void actionPerformed( ActionEvent e){
            int temp = Integer.parseInt( temperatureF.getText());
            int celcius = (int)(5.0f/ 9.0f * (temp-32));
            label2.setText( "Temperature in Celcius is :"+celcius);
        }
    } );
    
    label2 = new JLabel ( "Temperature in Celcius is : ");
     setLayout (new BorderLayout());
     add( label1, BorderLayout.NORTH);
     add( temperatureF, BorderLayout.CENTER);
     add( label2, BorderLayout.SOUTH);
    }
}
