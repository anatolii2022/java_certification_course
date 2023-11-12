package java_basics_oop;

public class Fish extends Animal {

	public Fish(String animalName, String animalColor, int age, int weight) {
		super(animalName, animalColor, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void swimm() {
		System.out.println("swimming...");
	}

	@Override
	public void move() {
		System.out.println("swimming...");
		
	}

}
