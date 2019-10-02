package leetCode;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * We can do this using HashMap concept
		 * We loop through the array and store the character as key and index as value
		 * When we find a character that already exists in the map, we place the value of that key as -1 
		 * Now define an integer called minimum with Integer Max Value
		 * Loop through the hashmap and store the value of the character in the min variable if that value is greater than -1 and less than Max Value
		 * After the loop we will have the index value of the first unique character in the minimum variable
		 * Return -1 if that min value is still equal to Integer_MAX_Value else return the min.
		 */
		
		String s = "loveleetcode";
		System.out.println("first unique character is: " + firstUniqueCharacter(s));
		

	}

	private static int firstUniqueCharacter(String s) {
		
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int min = Integer.MAX_VALUE;
		for(int i=0; i<chars.length; i++) {
			if(map.containsKey(chars[i])) {
				map.put(chars[i], -1);
			}
			else {
				map.put(chars[i], i);
			}
		}
		
		for(char c: map.keySet()) {
			if(map.get(c)<min && map.get(c)>-1) {
				min = map.get(c);
			}
		}
		
		return min == Integer.MAX_VALUE ? -1 : min;
	}

}
