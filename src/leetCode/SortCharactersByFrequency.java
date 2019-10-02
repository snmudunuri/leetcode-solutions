package leetCode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		/*
		 * We can solve this using HashMap and Priority Queue
		 * First we add all the characters to Hash Map and with total frequency of the char as value to the key
		 * Now we create a priority queue based on the condition (char1, char2) -> freq(char2) - freq(char1)
		 * It then creates priority queue based on the frequency of the character
		 * Add all the values from map.KeySet to the heap
		 * Now we remove one by one from the queue until heap is empty
		 * for each remove operation we store the value in a variable and 
		 * create loop from 0 to variable to add the char to a new string builder object 
		 * In the end return the new string from string builder object
		 */
		
		String s = "tree";
		
		System.out.println(sortCharacterByFrequency(s));

	}

	private static String sortCharacterByFrequency(String s) {
		
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0; i< chars.length; i++) {
			if(map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i])+1);
			}
			else {
				map.put(chars[i], 1);
			}
		}
		
		PriorityQueue<Character> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
		queue.addAll(map.keySet());
		
		StringBuilder strBuild = new StringBuilder();
		
		while(!queue.isEmpty()) {
			char current = queue.remove();
			
			for(int i=0; i< map.get(current); i++) {
				strBuild.append(current);
			}
		}
		
		
		return strBuild.toString();
	}

}
