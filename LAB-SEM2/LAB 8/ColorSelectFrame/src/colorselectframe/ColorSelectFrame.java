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
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
public class ColorSelectFrame extends JFrame{

    private JButton okJButton;
    private JButton cancelJButton;
    private JCheckBox backgroundJCheckBox;
    private JCheckBox foregroundJCheckBox;
    private JComboBox colorJComboBox;
    private JPanel panel;
    private JPanel panel2;
    
    public ColorSelectFrame () {
        super ("CSE3101-OO Programming");
        setLayout (new BorderLayout());
        
        colorJComboBox = new JComboBox();
        colorJComboBox.addItem ("RED");
        colorJComboBox.addItem ("BLUE");
        add( colorJComboBox, BorderLayout.NORTH);
        
        panel= new JPanel();
        backgroundJCheckBox = new JCheckBox( "Background");
        foregroundJCheckBox = new JCheckBox( "Foreground");
        panel.add( backgroundJCheckBox);
        panel.add( foregroundJCheckBox);
        add( panel, BorderLayout.CENTER);
        
        okJButton = new JButton ("Ok");
        cancelJButton = new JButton ("Cancel");
        panel2 = new JPanel();
        panel2.add(okJButton);
        panel2.add(cancelJButton);
        add( panel2, BorderLayout.SOUTH);
    }
}