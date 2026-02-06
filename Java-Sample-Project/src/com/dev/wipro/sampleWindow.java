package src.com.dev.wipro;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class sampleWindow extends JFrame implements ActionListener  {

	  // JTextField
    static JTextField t;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // label to display text
    static JLabel l;

    // default constructor
    sampleWindow()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("Sample Screen");

        // create a label to display text
        l = new JLabel("nothing entered");

        // create a new button
        b = new JButton("submit");

        // create a object of the text class
        sampleWindow te = new sampleWindow();

        // addActionListener to button
        b.addActionListener(te);

        // create a object of JTextField with 16 columns
        t = new JTextField(16);

        // create an object of font type
        Font fo = new Font("Serif", Font.BOLD, 20);

        // set the font of the textfield
        t.setFont(fo);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(t);
        p.add(b);
        p.add(l);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
        f.setLocationRelativeTo(null);
    }

 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  String s = e.getActionCommand();
	        if (s.equals("submit")) {
	            // set the text of the label to the text of the field
	            l.setText(t.getText());

	            // set the text of field to blank
	            t.setText("  ");
	        }
	}
	
}
