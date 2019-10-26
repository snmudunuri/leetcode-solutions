package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsfromTwoSentences {

	public static void main(String[] args) {
		/*
		 * We can solve this using HashMap
		 * Concatenate given two strings into one string
		 * Split the string into string array
		 * Create a map for string array with freq
		 * add the keys that has frequency 1 to the list
		 * return the list as array
		 */
		
		String A = "this apple is sweet", B = "this apple is sour";
		String[] out = uncommonWords(A,B);
		for(String s: out) {
			System.out.println(s);
		}

	}

	private static String[] uncommonWords(String a, String b) {
		String c = a + " " + b;
		String[] s = c.split("\\W+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<>();
		for(String i: s) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(String i: map.keySet()) {
			if(map.get(i)==1) {
				list.add(i);
			}
		}
		return list.toArray(new String[0]);
	}

}
