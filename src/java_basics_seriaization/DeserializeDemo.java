package java_basics_seriaization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java_basics_practical_project_car_dealership.Employee;

public class DeserializeDemo {

	public static void main(String[] args) {
		 Employee e = null;
		 try {
			FileInputStream fileInput = new FileInputStream("D:\\01_software_development\\03_Workspaces\\02_eclipse-workspace\\Java_Certification_Course\\tmp\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileInput);
			e = (Employee) in.readObject();
			in.close();
			fileInput.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class no found");
			c.printStackTrace();
			return;
		}
		 
		 System.out.println("Desirialized Employee....");
		 System.out.println("Name: " + e.getName());
		 System.out.println("Number: " + e.getNumber());
		 
	}

}
