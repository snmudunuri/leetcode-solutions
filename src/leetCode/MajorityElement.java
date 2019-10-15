package leetCode;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		/*
		 * We can solve this using hash map
		 * Iterate through given array and add integers as keys and their frequency as values
		 * We will return the number when it's frequency is greater than n/2
		 */
		
		int[] nums = {2,2,1,1,1,2,2};
		
		System.out.println(majorityElement(nums));

	}

	private static int majorityElement(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num: nums) {
			if(map.containsKey(num)&&(map.get(num)+1)>nums.length/2) {
				return num;
			}
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		return -1;
	}

}
