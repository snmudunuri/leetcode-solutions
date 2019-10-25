package leetCode;

import java.util.HashMap;

public class FindWordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {
		/*
		 * We can solve this using HashMap
		 * Build a hash map for given string
		 * Then loop through the string array
		 * for each string create a map
		 * now loop through the map and see value in first map is greater than or equal to 
		 * value in second map for that same character.
		 */
		
		String s = "atach";
		String[] words = {"cat","bt","hat","tree"};
		System.out.println(wordsFormed(words, s));

	}

	private static int wordsFormed(String[] words, String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int count =0;
		for(char c : s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(String word: words) {
			int size = word.length();
			HashMap<Character, Integer> map2 = new HashMap<>();
			for(char c: word.toCharArray()) {
				map2.put(c, map2.getOrDefault(c, 0)+1);
				}
			for(char c: map2.keySet()) {
				if(!map.containsKey(c)||map.get(c)<map2.get(c)) {
					size=0;
					break;
				}
			}
			count = count + size;
		}
		return count;
	}

}
