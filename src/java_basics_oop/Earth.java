package java_basics_oop;

public class Earth {

	public static void main(String[] args) {
		Human tom; // instance variable
		
//		tom = new Human(); //  object
//		
//		tom.name = "Tom";  // initializing 
//		tom.age = 5;
//		tom.eyeColor = "green";
//		tom.heightInInches = 72;
//		
//		tom.speak();
//		
//		Human joe = new Human(); // object
//		
//		joe.heightInInches = 67;
//		joe.name = "Joe";
//		joe.age = 35;
//		joe.eyeColor = "brown";
//		
//		joe.speak();
		
		Human human = new Human("Tom", 25, 76, "blue");
		
		human.speak();
	}
}
