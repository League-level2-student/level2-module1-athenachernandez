package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println("String at element " + i + ": " + s);
		}
		//4. Print all the Strings using a for-each loop
		for (String s : list) {
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < list.size(); i+=2) {
			String s = list.get(i);
			System.out.println("String at element " + i + ": " + s);
		}
		
		//6. Print all the Strings in reverse order.
		for(int i = list.size()-1; i >= 0; i--) {
			String s = list.get(i);
			System.out.println("String at element " + i + ": " + s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.contains("e")) {
				System.out.println("String at element " + i + ": " + s);
			}
			
	}
	}
}
