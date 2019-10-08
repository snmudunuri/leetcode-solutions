package leetCode;

import java.util.HashMap;

public class FindTheDifference {

	public static void main(String[] args) {
		/*
		 * We can do this using Hash Maps
		 * Initiate a Hash Map and add all the characters from string s to the map
		 * with their frequency as values
		 * Now loop through the string t to check if that character exists in the map
		 * if it exists we have check if it's frequency is 0 and return the char
		 * else we reduce the char frequency by 1
		 *
		 */
		
		String s = "abcdabce";
		String t = "abcfdabce";
		
		System.out.println("Added char is: " + difference(s,t));

	}

	private static char difference(String s, String t) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c: t.toCharArray()) {
			if(map.containsKey(c) && map.get(c)==0 || !map.containsKey(c)) {
				return c;
			}
			else {
				map.put(c, map.get(c)-1);
			}
		}
		
		return '!';
	}

}
