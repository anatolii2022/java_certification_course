package java_basics_oop;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(String animalName, String animalColor, int age, int weight) {
		super(animalName, animalColor, age, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("flying....");
		
	}
	
	

}
