package java_basics_practical_project_car_dealership;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	int number;

	// getter and setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}

	// concrete methods
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaktion(cust, vehicle);
		} else {
			System.out.println("You have not enough money!");
			System.out.println("Your amount is " + cust.getCashOnHand());
			System.out.println("Car price is " + vehicle.getPrice());
		}

	}

	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer " + cust.getName() + " ...");
		System.out.println("Customer " + cust.getName() + " has been approved to purchase the vehicle");
		System.out.println("The loan amount to be issued " + loanAmount);
	}

	public void processTransaktion(Customer cust, Vehicle vehicle) {
		System.out.println("Customer " + cust.getName() + " has successfully purchased the vehicle! " + vehicle.toString());
		vehicle.vehicleToBeSold();
	}

}
