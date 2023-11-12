package java_basics_processing_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
//		for (int i = 0; i <= 3; i++) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some text...");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}

		File file = new File("myfile.txt");
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}

		input.close();

		MyFileUtils fileUtils = new MyFileUtils();
		try {
			System.out.println(fileUtils.subtract10FromLagerNumber(8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
