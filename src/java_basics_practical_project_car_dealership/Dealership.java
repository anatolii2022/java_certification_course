package java_basics_practical_project_car_dealership;

public class Dealership {

	public static void main(String[] args) throws CloneNotSupportedException {

		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("Cagliary");
		cust1.setCashOnHand(25000);
		
		Customer cust2 = (Customer)cust1.clone();

		Vehicle car = new Vehicle("Mazda CX5", "red",15000, true);

		Employee employee = new Employee();

		cust1.purchaseCar(car, employee, false);
		
		cust2.purchaseCar(car, employee, false);

	}

}
