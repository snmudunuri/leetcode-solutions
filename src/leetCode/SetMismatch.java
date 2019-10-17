package leetCode;

import java.util.HashSet;

public class SetMismatch {

	public static void main(String[] args) {
		/*
		 * We can solve this in two steps
		 * First step is to find the number that's duplicate and add it to the int array
		 * If number is not duplicate then add it to the HashSet and add the integer to sum varaible to calucalte the total sum
		 * Now we have our first index filled in
		 * To find out the missing number we can use Gauss's law for sum of first n natural numbers n*(n+1)/2 where n is the length of given array
		 * We subtract sum from the above result and add it to first index and return the result array 
		 */
		
		int[] nums = {1,2,2,4};
		int[] output = setMismatch(nums);
		for(int i: output) {
			System.out.println(i);
		}

	}

	private static int[] setMismatch(int[] nums) {
		int n = nums.length;
		HashSet<Integer> set = new HashSet<Integer>();
		int[] result = new int[2];
		int sum =0;
		for(int i: nums) {
			if(set.contains(i)) {
				result[0] = i;
			}
			else {
				set.add(i);
				sum += i;
			}
		}
		
		result[1] = (n*(n+1)/2)- sum;
		return result;
	}

}
