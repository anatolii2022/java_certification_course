package java_basics_oop;

public class Bird extends Animal {
	
	public Bird(String animalName, String animalColor, int age, int weight) {
		super(animalName, animalColor, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("flying...");
	}

	@Override
	public void move() {
		System.out.println("flapping with wings...");
		
	}

}
