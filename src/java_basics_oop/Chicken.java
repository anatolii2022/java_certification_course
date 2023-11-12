package java_basics_oop;

public class Chicken extends Bird {

	public Chicken(String animalName, String animalColor, int age, int weight) {
		super(animalName, animalColor, age, weight);
		// TODO Auto-generated constructor stub
	}
	
	//overriding the method defined in Bird  | override = replace
	public void fly() {
		System.out.println("not able to fly...");
	}

}
