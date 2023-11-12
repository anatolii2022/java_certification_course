package java_basics_practical_project_car_dealership;

public class Customer implements Cloneable {

	// instance variables
	private String name;
	private String address;
	private double cashOnHand;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		address += " Dealership City";
		this.address = address;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	// overridden methods
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// concrete methods
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, finance, vehicle);
	}

}
