package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> numbers = new Stack<Double>();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			numbers.push((new Random().nextDouble())*100);
		
			
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		JOptionPane.showMessageDialog(null, "Enter 2 numbers between 0 and 100, smallest number first");
		String a = JOptionPane.showInputDialog("First number:");
		int c = Integer.parseInt(a);
		if (c>100||c<0 ){
			JOptionPane.showMessageDialog(null, "That is not a number between 0 and 100!");
			System.exit(0);
		}
		String b = JOptionPane.showInputDialog("Second Number:");
		
		int d = Integer.parseInt(b);
		if (d>100||d<0 ){
			JOptionPane.showMessageDialog(null, "That is not a number between 0 and 100!");
			System.exit(0);
		}
		if(c>=d) {
			JOptionPane.showMessageDialog(null, "Second number is not larger than first number!");
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, "Popping elements off stack...");
		String bigstring="Elements between "+c+" and "+d+":";
		for (int i = 0; i < 100; i++) {
			double v=numbers.pop();
			if(v>c) {
				if(v<d) {
					bigstring+="\n"+v;
				}
			}
		}
		JOptionPane.showMessageDialog(null, bigstring);
		
		
		
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
