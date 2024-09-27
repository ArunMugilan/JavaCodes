/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */



import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Rectangle implements ActionListener{
    private static JLabel Length, Width, s, r;
    private static JTextField getLength, getWidth;
    private static JButton Calculate;
    private String length, width;
    private int L, W;
    
    
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Area and Perimeter Calculator");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(new GridLayout(4,2));
        
        Length = new JLabel("Length");
        Length.setBounds(15, 25, 85, 35);
        panel.add(Length);
        
        getLength=new JTextField(20);
        getLength.setBounds(60, 30, 175, 35);
        panel.add(getLength);
        
       
        Width = new JLabel("Width");
        Width.setBounds(20, 70, 90, 35);
        panel.add(Width);
        
        getWidth=new JTextField(20);
        getWidth.setBounds(60, 70, 175, 35);
        panel.add(getWidth);
        
        Calculate= new JButton("Calculate");
        Calculate.setBounds(20, 110, 90, 35);
        Calculate.addActionListener((ActionListener) new Rectangle());
        panel.add(Calculate);
        
        
        
        frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        length=getLength.getText();
        width=getWidth.getText();
        L =Integer.parseInt(length);
        W =Integer.parseInt(width);
        
       Area A1= new Area();
       Perimeter P1=new Perimeter();
        String q =("Area: "+ A1.Area(L, W));
        s.setText(q);
        String t =("Perimeter: "+ P1.Perimeter(L, W));
        r.setText(t);
       // System.out.println(s);    
    }
}
