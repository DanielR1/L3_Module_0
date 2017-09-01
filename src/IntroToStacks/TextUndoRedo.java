package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	int l = 0;
	Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo text = new TextUndoRedo();
		text.setup();
		JOptionPane.showMessageDialog(null, "ALT is the undo key");
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> stack2 = new Stack<String>();

	void setup() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);

		frame.setVisible(true);
		frame.pack();
		frame.setSize(500, 500);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		// TODO Auto-generated method stub
		String del;
		String del2;
		String del3;
		String del4;
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			if(l>0) {
			del = label.getText();
			del2 = del.substring(0,del.length()-1);
			label.setText(del2);
			del3 = del.substring(del.length()-1, del.length());
			stack.push(del3);
			l-=1;
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_ALT){
			if(stack.size()>0) {
			del4=stack.pop();
			label.setText(label.getText()+del4);
			l+=1;
			}
		}
		
		else {
	
			label.setText(label.getText()+e.getKeyChar());
			l+=1;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
