package java_basics_oop;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal cat;
//		cat = new Animal("cat", "grey", 3, 5);  Abstract Class cannot be instantiated

//		cat.noise();
//		cat.eating();
//		cat.sleeping();

//		Bird bird = new Bird("Seagal", "white", 3, 4);
//		bird.noise();
//		bird.fly();
//		
//		Chicken chicken = new Chicken("Chicken", "brown", 2, 4);
//		chicken.fly(); 
//		
//		Sparrow sparrow = new Sparrow("Sparrow", "colorful", 1, 1);
//		sparrow.fly();
//		sparrow.move();

		Animal sparrow2 = new Sparrow("sparrow", "broun", 1, 2);
		//sparrow2.move();

		Animal fish = new Fish("parrotfish", "colorfull", 1, 2);
		//fish.move();
		
		moveAnimal(fish);  // passing instance variable as a parameter
		moveAnimal(sparrow2);
		
		//instance variable of type Flyable
		Flyable flyingBird = new Sparrow("sparrow3", "grey", 1, 1);
		flyingBird.fly();
		//Flyable flyingBird2 = new Bird("sparrow4", "grey", 1, 1);  the class Bird does not implement the interface Flyable

	}
	
	// polymorphism - all children of parent class can use the method
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
