package leetCode;

import java.util.HashMap;

public class MostCommonWord {

	public static void main(String[] args) {
		/*
		 * We can do this using Hash Maps
		 * First we split the Sentence into string array 
		 * We ignore all the special characters and spaces while splitting
		 * Now that we have the string array, we loop through the array
		 * Convert string to lower case 
		 * Add the string as key to map
		 * Value will be 1 if map don't contain the value else we will increment
		 * Once we have the map, we loop through the banned array
		 * If we find a string from the banned array, we set the value of that key to 0
		 * Now we can define a result string set to null and max val set to 0
		 * We then loop through the map to get the max frequency string and set it to result variable
		 * Finally return the string
		 */
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		
		System.out.println(mostCommonWord(paragraph, banned));

	}

	private static String mostCommonWord(String paragraph, String[] banned) {
		String[] strArray = paragraph.split("[\\s,.!?;':]+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s: strArray) {
			s = s.toLowerCase();
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(String s: banned) {
			if(map.containsKey(s)) {
				map.put(s, 0);
			}
			
		}
		
		String result = "";
		int max = 0;
		
		for (String s: map.keySet()){
			if(map.get(s)>max) {
				max = map.get(s);
				result = s;
			}
		}
		
		return result;
	}

}
