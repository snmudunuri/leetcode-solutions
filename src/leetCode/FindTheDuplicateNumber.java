package leetCode;

import java.util.HashSet;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		/*
		 *  We can easily solve this using Hash set without modifying the array
		 * It's simple, we just loop through the array
		 * for each num we check if it exists in the set and return when it found
		 * else we add that to the set
		 *  
		 */
		int[] nums = {1,2,3,4,3};
		System.out.println(findDuplicate(nums));
		
	}

	private static int findDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num: nums) {
			if(set.contains(num)) {
				return num;
			}
			set.add(num);
		}
		
		return -1;
	}

}
