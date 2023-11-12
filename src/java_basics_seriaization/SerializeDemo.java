package java_basics_seriaization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java_basics_practical_project_car_dealership.Employee;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Reyan Ali");
		e.setNumber(101);

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\01_software_development\\03_Workspaces\\02_eclipse-workspace\\Java_Certification_Course\\tmp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
