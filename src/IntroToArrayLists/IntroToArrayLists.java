package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList();
		
		//2. Add five Strings to your list
		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			String s= list.get(i);
			System.out.println(""+s);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String s : list) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			String s=list.get(i);
			if (i%2==0){
				System.out.println(s);
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4;i>-1; i--) {
			String s= list.get(i);
			System.out.println(""+s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			String s=list.get(i);
			if (s.contains("e")){
				System.out.println(s);
			}
	}
}
}
