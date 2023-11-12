package java_basics_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapAndTreeMap {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "(of light or colour) very bright.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence",
				"the feeling or belief that one can have faith in or rely on someone or something.");

//		for (String word : dictionary.keySet()) {
//			System.out.println(word);
//		}

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry);
			// System.out.println("***********************");
			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
		}

		System.out.println("***********************");

		/*********************************************************************************************************/
		LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<String, String>();
		dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary1.put("Brilliant", "(of light or colour) very bright.");
		dictionary1.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary1.put("Confidence",
				"the feeling or belief that one can have faith in or rely on someone or something.");

		for (String word : dictionary1.keySet()) {
			System.out.println(word + " - " + dictionary.get(word));

		}

		System.out.println("***********************");

		/*********************************************************************************************************/
		TreeMap<String, String> dictionary2 = new TreeMap<String, String>();
		dictionary2.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary2.put("Brilliant", "(of light or colour) very bright.");
		dictionary2.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary2.put("Confidence",
				"the feeling or belief that one can have faith in or rely on someone or something.");

		for (String word : dictionary2.keySet()) {
			System.out.println(word + " - " + dictionary2.get(word));

		}

	}

}
