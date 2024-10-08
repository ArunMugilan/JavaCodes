package package2;
//Fig. 14.6: Labe1Frame. java
//Demonstrating the JLabel class.
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame
{
	private JLabel label1; // JLabel with just text
	private JLabel label2; // JLabel constructed with text and icon
	private JLabel label3; // JLabel with added text and icon
	//LabelFrame constructor adds JLabels to JFrame
	public LabelFrame()
	{
		super( "Testing JLabel" );
		setLayout( new FlowLayout() ); // set frame layout
		
		// JLabe1 constructor with a string argument
		label1 = new JLabel( "Label with text" );
		label1.setToolTipText( "This is Label1" );
		add( label1 ); // add label1 to JFrame
		//JLabel constructor with string, Icon and alignment arguments
		//ImageIcon(getClass().getResource("D://Java_FTKKI//WorkSpace//GUI Lecture Examples//src//package2//bug1.png"));
		Icon aa = new ImageIcon( getClass().getResource( "/bug-icon.png" ) );
		
		label2 = new JLabel( "Label with text and icon", aa, SwingConstants.LEFT );
		label2.setToolTipText( "This is label2" );
		add( label2 ); // add 1abe12 to JFrame
		label3 = new JLabel(); // JLabel constructor no arguments
		label3.setText( "Label with icon and text at bottom" );
	//	label3.setIcon( bug ); // add icon to
		label3.setHorizontalTextPosition( SwingConstants.CENTER);
		label3.setVerticalTextPosition( SwingConstants.BOTTOM );
		label3.setToolTipText( "This is label3" );
		add( label3 ); // add 1abe13 to JFrame
	} // end Labe1Frame constructor
}	// end class


