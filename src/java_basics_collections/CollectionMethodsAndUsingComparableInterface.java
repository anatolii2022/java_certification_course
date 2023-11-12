package java_basics_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionMethodsAndUsingComparableInterface {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(45);
		hashSet.add(55);
		hashSet.add(3);
		hashSet.add(78);
		hashSet.add(90);
		hashSet.add(99);
		hashSet.add(32);

		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);

		Collections.sort(myList);

//		System.out.println(myList);

		List<Integer> list3 = new ArrayList<Integer>(hashSet);

//		for(Integer value : list3) {
//		System.out.println(value);
//	}
		/***************************************************************/
		HashSet<Employee> hashSet1 = new HashSet<Employee>();
		hashSet1.add(new Employee("Mike", 3500, "Accounting"));
		hashSet1.add(new Employee("Paul", 3000, "Admin"));
		hashSet1.add(new Employee("Peter", 4000, "IT"));
		hashSet1.add(new Employee("Angel", 2000, "Maintenance"));

		ArrayList<Employee> employeeList = new ArrayList<Employee>(hashSet1);
		
		Collections.sort(employeeList);
		
		System.out.println(employeeList);
		
		 

		/***************************************************************/

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);

		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		newList.add(15);

//		list1.addAll(newList);
//		
//		System.out.println(list1);
//		
//		list1.removeAll(newList);
//		
//		System.out.println(list1);
//		
//		list1.clear();
//		
//		System.out.println(list1);

//		boolean hasValue = list1.contains(67);
//		
//		System.out.println(hasValue);
		/***************************************************************/

	}

}
