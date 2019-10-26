package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		/*
		 * We can solve this using Hash Set
		 * Store all the values in nums1 to the set
		 * Iterate through nums2 and add num to the list when you find a match
		 * and remove the element from set
		 */
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] output = intersection(nums1, nums2);
		for(int i: output) {
			System.out.println(i);
		}

	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set =  new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i: nums1) {
			if(!set.contains(i)) {
				set.add(i);
			}
		}
		for(int i: nums2) {
			if(set.contains(i)) {
				list.add(i);
				set.remove(i);
			}
		}
		int[] out = new int[list.size()];
		for(int i=0; i<out.length;i++) {
			out[i]=list.get(i);
		}
		return out;
	}

}
