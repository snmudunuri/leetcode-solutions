package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		/*
		 *  We can easily solve this using Hash set
		 * but we have constraint to not use extra space and linear time complexity
		 * so we have do this using by converting all integers in the array to negative
		 * Logic:
		 * 		Given conditions is any integer in the array is between 1 and length of the array inclusive
		 * 		so logically each (integer-1) value is an index of that array
		 * 		we loop though the array
		 * 		take the value at index (Current integer -1) 
		 * 		and check if it is less than 0
		 * 			if >0 - we make it negative 
		 * 			We are doing the above check to make sure we are not turning them positive again when we find a duplicate
		 * 	Now we have the array with -ve number
		 * 	We will have few positive numbers in the array
		 * 	index+1 of those positive numbers are missing numbers
		 * 	we add those to the list and we return list in the end
		 * 
		 */
		
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> output = missingNum(nums);
		for(int i: output) {
			System.out.println(i);
		}

	}

	private static List<Integer> missingNum(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i: nums) {
			int n= Math.abs(i);
			int index = n-1;
			if(nums[index]>0) {
				nums[index] = -nums[index];
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>0) {
				list.add(i+1);
			}
		}
		
		return list;
	}

}
