package leetCode;

import java.util.HashMap;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		/*
		 * We can do this using Hash Map
		 * We store the integer as key and it's index as value 
		 * When we see a value that's already in the map we check if
		 * the absolute difference between value of that key and current index is <= given k value
		 * If the above condition is satisfied we return true
		 * else we replace the value of that key with our new index
		 */
		
		int[] input = {1,0,1,1};
		int k = 2;
		
		System.out.println(containsDuplicate(input, k));

	}

	private static Boolean containsDuplicate(int[] input, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<input.length; i++) {
			if(map.containsKey(input[i])) {
				if((Math.abs(map.get(input[i])-i))<=k) {
					return true;
				}
				else {
					map.put(input[i], i);
				}
			}
			else {
				map.put(input[i], i);
			}
		}
		
		
		return false;
	}

}
