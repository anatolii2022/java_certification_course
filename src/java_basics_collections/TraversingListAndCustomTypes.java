package java_basics_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TraversingListAndCustomTypes {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("Dog");
		animals.add("Bird");
//
//		// for loop
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//
//		// for each loop
//		for (String s : animals) {
//			System.out.println(s);
//		}
//
//		int[] arr = new int[4];
//		arr[0] = 2;
//		arr[1] = 34;
//		arr[2] = 3;
//		arr[3] = 5;
//		
//		for(int j:arr) {
//			System.out.println(j);
//		}

		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(new Vehicle("Toyota", "Camry", 12000, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

		for (Vehicle v : vehicles) {
			//System.out.println(v.getMake() + " " + v.getModle() + " " + v.getPrice() + " " + v.getFourWDrive());
			System.out.println(v.toString());
		}
		
		printElements(animals);

	}
	
	public static void printElements(List someList) {
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
