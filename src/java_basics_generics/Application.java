package java_basics_generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<String, Integer> container = new Container<>("Tom", 32);
		//container.printItems();
		String s = container.getItem1();
		int a = container.getItem2();

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");

		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("Computer");

		Set<String> resultSet = union(mySet1, mySet2);

		Iterator<String> it = resultSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	//generic method
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
