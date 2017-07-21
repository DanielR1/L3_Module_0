package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton button1;
	JButton button2;
	ArrayList<String> list= new ArrayList();

	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		
		book.createGUI();
	}
	public void createGUI(){
	
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.add(panel);
		button1=new JButton("Add Name");
		button2=new JButton("View Names");
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		
		button1.setSize(200, 100);
		button2.setSize(200, 100);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			String s=JOptionPane.showInputDialog("Enter a name.");
			list.add(""+s);
			
	}
		if(e.getSource()==button2){
			String biglist=new String("");
			for (int i = 0; i < list.size(); i++) {
			biglist+="Guest #"+(i+1)+" "+list.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, ""+biglist);
		}
}
	}
