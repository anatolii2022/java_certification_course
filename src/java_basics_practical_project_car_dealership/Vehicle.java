package java_basics_practical_project_car_dealership;

public class Vehicle {

	private String model;
	private String color;
	private int price;
	private boolean conditionNew;

	public Vehicle(String model, String color, int price, boolean conditionNew) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.conditionNew = conditionNew;
	}
	
	// setter
	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setConditionNew(boolean conditionNew) {
		this.conditionNew = conditionNew;
	}
	// getter

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public boolean getConditionNew() {
		return conditionNew;
	}

	// concrete methods
	
	
	
	public void vehicleToBeSold() {
		System.out.println("----------------------------------------");
		System.out.println("Congratulations! You have just bought: ");
		System.out.println("Model - " + getModel());
		System.out.println("Color - " + getColor());
		System.out.println("Condition - " + getConditionNew());
		System.out.println("Total price " + getPrice());
		System.out.println("----------------------------------------");
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", color=" + color + ", price=" + price + ", conditionNew=" + conditionNew
				+ "]";
	}

}
