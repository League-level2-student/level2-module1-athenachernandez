package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	
	
void run() {
	// need a JFrame with a JPanel and 2 JButtons
	
	frame = new JFrame();
	panel = new JPanel();
	button1 = new JButton();
	button2 = new JButton();
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	button1.setText("Add Name");
	button2.setText("View Names");

	frame.pack();
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		System.out.println(buttonClicked.getText());
		

		}
	}
	
}
