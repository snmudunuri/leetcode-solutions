package leetCode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		/*
		 * We can solve this using HashSet
		 * Take two indices both starting at 0
		 * Keeping one index constant traverse the other index through the string
		 * Logic:
		 * 		if set contains the current char
		 * 			remove the char that's at index i
		 * 			increment the i by 1
		 * 		else
		 * 			add it to the set
		 * 			increment the index j
		 * 			calculate the max value between max and set size
		 * return max value
		 */
		
		String s = "abcdabcab";
		System.out.println(longestSubstring(s));

	}

	private static int longestSubstring(String s) {
		HashSet<Character> set = new HashSet<Character>();
		int i=0, j=0, max = 0;
		while(j<s.length()) {
			if(set.contains(s.charAt(j))) {
				set.remove(s.charAt(i));
				i++;
			}else {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}
		}
		
		return max;
	}

}
