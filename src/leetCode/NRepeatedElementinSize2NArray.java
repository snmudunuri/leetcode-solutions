package leetCode;

import java.util.HashMap;

public class NRepeatedElementinSize2NArray {

	public static void main(String[] args) {
		/*
		 * We can solve this using Map
		 * We return the value when we hit a number
		 * whose frequency is = (arraysize)2-1
		 */
		int[] nums = {2,1,2,5,3,2};
		System.out.println(repeatedElement(nums));

	}

	private static int repeatedElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length/2-1;
		for(int i: nums) {
			if(map.containsKey(i) && map.get(i)==n) {
				return i;
			}
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		return -1;
	}

}
