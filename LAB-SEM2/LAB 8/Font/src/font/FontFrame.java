/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package font;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class FontFrame extends JFrame implements ActionListener {
    private String a;
    private JTextField textField = new JTextField( 15);
    private JRadioButton arial = new JRadioButton("Lucida Handwriting",true);
    private JRadioButton alg = new JRadioButton("Algerian",false);
    private JRadioButton tnr = new JRadioButton("Times New Roman",false);
    private JRadioButton clb = new JRadioButton("Calibri",false);

     public FontFrame(){

        super("Changing text program");
        setLayout (new FlowLayout());

        add(textField);
        a="Programming is Good";
        add (arial);
        add (alg);
        add (tnr);
        add (clb);

        arial.addActionListener(this);
        alg.addActionListener(this);
        tnr.addActionListener(this);
        clb.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

        if (e.getActionCommand() == "Lucida Handwriting"){
       textField.setText(a);
       textField.setFont(new Font("Lucida Handwriting" , Font.PLAIN, 14));
        }
        else if (e.getActionCommand() == "Algerian") {
            textField.setText(a);
               textField.setFont(new Font ("Algerian" , Font.PLAIN , 14));
        }
        else if (e.getActionCommand() == "Times New Roman") {
            textField.setText(a);
               textField.setFont(new Font ("Times New Roman" , Font.PLAIN , 14));
        }
        else{
            textField.setText(a);
               textField.setFont(new Font ("Calibri" , Font.PLAIN , 14));
        }

    }
}
