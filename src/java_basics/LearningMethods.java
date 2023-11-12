package java_basics;

import java_basics_access_modifier.Example;

public class LearningMethods {

	public static void main(String[] args) {

		LearningMethods methods; 
		methods = new LearningMethods();
		methods.printSomeJunk("this is some data"); // methods belong to instance not to the class directly

		// printSomeJunk("this is some data");

		LearningMethods.sumNumbers(10, 23);
		System.out.println(add10(46));

		int count = LearningMethods.add10(67);
		System.out.println(count);

		Example.doSomething();

	}

	public void printSomeJunk(String text) {
		System.out.println(text);
	}

	public static void printSomeJunk(int number) {
		System.out.println(number);
	}

	public static void sumNumbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}

	public static int add10(int someArg) {
		return someArg + 10;
	}

}
