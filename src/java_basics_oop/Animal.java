package java_basics_oop;

public abstract class Animal {

	//class is a blueprint, design, specification of an object
	
	String animalName;
	String animalColor;
	int age;
	int weight;

	public Animal(String animalName, String animalColor, int age, int weight) {
		this.animalName = animalName;
		this.animalColor = animalColor;
		this.age = age;
		this.weight = weight;
	}

	public void noise() {
		System.out.println("I am " + animalName);
		System.out.println("My color is " + animalColor);
		System.out.println("I am " + age + " years old");
		System.out.println("I am weighing " + weight);
	}

	public void eating() {
		System.out.println("eating...");
	}

	public void sleeping() {
		System.out.println("sleeping...");
	}

	public void walking() {
		System.out.println("walking...");
	}
	
	public abstract void move(); 

}
