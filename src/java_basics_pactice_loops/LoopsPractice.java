package java_basics_pactice_loops;

public class LoopsPractice {

	public static void main(String[] args) {

		int count = 0;

//		while (true) {
//			// do something
//		}
		/****************************** while loop ************************************/
//		while (count <= 100) {
//			System.out.println("Anatolii " + count);
//			count = count + 1;
//
//			if (count == 30) {
//				break;
//			}
//			// count++;
//		}

		String name = "sdfrgdfgghjhjztur";
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println("char forward: " + name.charAt(i));
//		}
//		
//		for (int i = 16; i < name.length(); i--) {
//			if (i == -1)
//				break;
//			System.out.println("char backward: " + name.charAt(i));
//
//		}

//		for (int i = name.length() - 1; i >= 0; i--) {
//			System.out.println("char backward: " + name.charAt(i));
//		}
//		
//		for(int i = 0; i <= 100; i++) {
//			if(i%2==0) {
//				System.out.println("even number: " + i);
//			}
//		}

//		for(int i = 0; i <= 100; i+=2) {
//				System.out.println("even number: " + i);
//			
//		}
//		
		/******************************
		 * nested for loop
		 ************************************/

//		int counter = 0;
//		
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(i);
//			int temp = counter +1;
//			counter = temp;
//		}

		int counter = 0;

		for (int idx = 0; idx < 100; idx++) {

			for (int j = 0; j < 10; j++) {

				System.out.println("value of idx: " + idx + "------" + "value of j: " + j);
				counter++;
			}

			
		}
		System.out.println("COUNTER: " + counter);
	}

}
