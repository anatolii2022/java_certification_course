package java_basics_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraListAndLinkedList {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
		words.add("10");

		String item1 = words.get(0);

		System.out.println(item1);

		words.stream().forEach(s -> System.out.println(s));
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(101);
		numbers.add(141);
		numbers.add(167);
		numbers.add(1010);
		
		for(int number : numbers) {
			System.out.println(number);
		}

	}

}
