/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometaxgui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class IncomeTaxGUI extends JFrame {

    /**
     * @param args the command line arguments
     */
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private JLabel aivLabel = new JLabel("Annual Income Value(RM):");
    private JLabel ictLabel = new JLabel("Income Tax Rate(%):");
    private JLabel titLabel = new JLabel("Total Income Tax(RM):");
    private JTextField aivJTF = new JTextField(20);
    private JTextField ictJTF = new JTextField(20);
    private JTextField titJTF = new JTextField(20);
    private JButton calculate = new JButton("Calculate");
    private JButton exit = new JButton("Exit");
    private DecimalFormat df = new DecimalFormat("0.00");

    public IncomeTaxGUI() {
        setLayout(new GridLayout(4,2));
        setTitle("Income Tax Calculator");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(aivLabel);
        add(aivJTF);
        add(ictLabel);
        add(ictJTF);
        add(titLabel);
        add(titJTF);
        add(calculate);
        add(exit);

        calculate.addActionListener(new CalculateButtonHandler());
        exit.addActionListener(new ExitButtonHandler());
    }

    public static void main(String[] args) {
        IncomeTaxGUI incomeTax = new IncomeTaxGUI();
    }
    
    private class CalculateButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double Annual_income = Double.parseDouble(aivJTF.getText());
                double income_rate = Double.parseDouble(ictJTF.getText());
                double Income_tax = Annual_income * income_rate / 100;
                titJTF.setText("" + df.format(Income_tax));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input must be number!\n" + nfe , "NumberFormatException", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ExitButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    

}
