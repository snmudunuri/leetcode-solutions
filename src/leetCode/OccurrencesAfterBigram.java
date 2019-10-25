package leetCode;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {

	public static void main(String[] args) {
		/*
		 * We can solve this using regular iteration
		 * We have to add the index +2 value if index == first and index+1 equals second
		 * Finally return list as array
		 */
		
		String text = "alice is a good girl she is a good student";
		String first = "a";
		String second = "good";
		
		String[] output = occurrences(text, first, second);
		for(String s: output) {
			System.out.println(s);
		}

	}

	private static String[] occurrences(String text, String first, String second) {
		String[] str = text.split("\\W+");
		List<String> list = new ArrayList<>();
		for(int i=0; i<str.length-2;i++) {
			if(str[i].equals(first) && str[i+1].equals(second)) {
				list.add(str[i+2]);
			}
		}
		return list.toArray(new String[0]);
	}

}
