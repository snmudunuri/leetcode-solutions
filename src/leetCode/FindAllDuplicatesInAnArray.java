package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		/*
		 * We can easily solve this using Hash set
		 * but we have constraint to not use extra space and linear time complexity
		 * so we have do this using by converting all integers in the array to negative
		 * Logic:
		 * 		Given conditions is any integer in the array is between 1 and length of the array inclusive
		 * 		so logically each (integer-1) value is an index of that array
		 * 		we loop though the array
		 * 		take the value at index (Current integer -1) 
		 * 		and check if it is less than 0
		 * 			if <0 - we add it to list
		 * 			else we make this negative
		 * 		To be more specific about why we are making negative
		 * 			In the following array 3 appears twice
		 * 			So in the loop I will reference to the same index (3-1) twice
		 * 			First time I will make it negative
		 * 			Next time when I try to check the value at (3-1) index, I see a negative value
		 * 			that means there was a 3 already once in the loop and hence we add that to the list
		 * 		we return the list finally
		 */
		
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> output = findAllDuplicates(nums);
		for(int num: output) {
			System.out.println(num);
		}

	}

	private static List<Integer> findAllDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int num: nums) {
			int n = Math.abs(num);
			int index = n-1;
			if(nums[index] <0){
				list.add(n);
			}
			nums[index] = -nums[index];			
		}
		return list;
	}

}
