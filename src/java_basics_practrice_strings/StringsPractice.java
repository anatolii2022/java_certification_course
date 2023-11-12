package java_basics_practrice_strings;

public class StringsPractice {

	public static void main(String[] args) {
		String a = "hello";
		String b = "there";
		String str = "ABCDEFG";
		String string = "Hello yogi there yogi there";
		String extractedString1 = str.substring(2);
		String extractedString2 = str.substring(0, 7);
		char myChar = a.charAt(3);
		int k = string.indexOf("there", 0); // starts at index
		int i = string.lastIndexOf("yogi");
		int j = string.indexOf("yogi");

		/********************************************************/

		if (a == b) {
			// THIS IS A TRAP. DON'T DO THIS
		}

		if (a.equals("hello")) {
			// USE THIS
		}

		if (b.equalsIgnoreCase("theRe")) {
			System.out.println("OK");
		}

		/********************************************************/
		System.out.println(a.length());
		System.out.println(str.length());
		System.out.println(extractedString1);
		System.out.println(extractedString2);
		System.out.println(myChar);
		System.out.println(k);
		System.out.println(i);
		System.out.println(j);

	}

}
