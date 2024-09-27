/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayaccess;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ArrayAccess extends JFrame{
private JTextField inputField, retrieveValueField, retrieveIndexField, outputField;
    private JPanel inputPanel, retrievePanel, outputPanel;
    private int num, index = 0, accessArray[];
    private String result;

    public ArrayAccess() {
        super("Accessing Array values");
        accessArray = new int[10];

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter array elements here"));
        inputField = new JTextField(10);
        inputField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        }
        );

        inputPanel.add(inputField);
        container.add(inputPanel);

        retrievePanel = new JPanel(new GridLayout(2, 2));
        retrievePanel.add(new JLabel("Enter number to retrieve"));
        retrieveValueField = new JTextField(10);
        retrieveValueField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e1) {
                retrieveValueField.setText("");
            }
        }
        );

        retrievePanel.add(retrieveValueField);
        retrievePanel.add(new JLabel("Enter index to retrieve"));
        retrieveValueField = new JTextField(10);
        retrieveValueField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e2) {
                retrieveValueField.setText("");
            }
        }
        );

        retrievePanel.add(retrieveIndexField);
        retrievePanel.add(retrievePanel);

        outputPanel = new JPanel();
        outputPanel.add(new JLabel("Result"));
        outputField = new JTextField(30);
        outputField.setEditable(false);
        outputPanel.add(outputField);
        container.add(outputPanel);

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        ArrayAccess application = new ArrayAccess();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

