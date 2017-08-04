package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	HashMap<Integer, String> map = new HashMap();

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons.
	 * 
	 * Button 1: Add Entry When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. After an ID is entered, use another
	 * input dialog to ask the user to enter a name. Add this information as a
	 * new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */
	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.createGUI();
	}

	public void createGUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		button1 = new JButton("Add Entry");
		button2 = new JButton("Search by ID");
		button3 = new JButton("View List");
		button4 = new JButton("Remove Entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String newID = JOptionPane.showInputDialog("Please Enter the new ID number");
			String newName = JOptionPane.showInputDialog("Please enter the name you want to add");
			int newIDint = Integer.parseInt(newID);
			map.put(newIDint, newName);
			JOptionPane.showMessageDialog(null, "Entry added!");
		}
		if (e.getSource() == button2) {
			String IDs = JOptionPane.showInputDialog("Please enter an ID");
			int id = Integer.parseInt(IDs);
			if (map.get(id) == null) {
				JOptionPane.showMessageDialog(null, "ERROR: Entry not found!");
			} else {
				JOptionPane.showMessageDialog(null, "ID #" + id + " matches with name " + map.get(id));
			}
		}
		if (e.getSource() == button3) {
			String biglist = "";
			for (Integer i : map.keySet()) {
				biglist += "ID: " + i + " Name: " + map.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, "" + biglist);

		}
		if (e.getSource() == button4) {
			String delIDs = JOptionPane.showInputDialog("Enter an ID to remove");//
		}

	}
}
