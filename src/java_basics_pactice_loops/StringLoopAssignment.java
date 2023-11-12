package java_basics_pactice_loops;

public class StringLoopAssignment {

	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in the category: apperal and the slightly more in demand category: makeup along with the category: furniture and category: elecronics .. category: computers ";

		printCategories(str);
	}

	/**********************************
	 * 
	 * extract all categories from the string argument
	 * 
	 * @param str
	 * 
	 ********************************/
	public static void printCategories(String str) {
		int i = 0;

		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1)
				break;
			int start = found + 10; // start of the actual category
			int end = str.indexOf(" ", start); 
			System.out.println(str.substring(start, end));
			i = end;

		}

	}

}
