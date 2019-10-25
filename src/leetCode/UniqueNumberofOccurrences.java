package leetCode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {

	public static void main(String[] args) {
		/*
		 * We can solve this using Hash Map and set
		 * Add all the occurrences of each integer in map
		 * Now run through the values of map and 
		 * return false if any of that values is in set already
		 */
		
		int[] nums = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(nums));

	}

	private static boolean uniqueOccurrences(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
		for(int i: nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int i: map.values()) {
			if(set.contains(i)) {
				return false;
			}
			set.add(i);
		}
		return true;
	}

}
