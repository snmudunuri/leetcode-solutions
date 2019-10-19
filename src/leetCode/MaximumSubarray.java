package leetCode;

public class MaximumSubarray {

	public static void main(String[] args) {
		/*
		 * We can solve this using dynamic programming
		 * Our sub problem solution will start at index =0
		 * Initiate two integers both equal to nums[0]
		 * We calculate the max value at the current index by comparing
		 * 		max at current + current number and current number
		 * Then we store the max value between prevMax and current max
		 * return prevmax
		 * 
		 */
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	private static int  maxSubArray(int[] nums) {
		int prevMax = nums[0];
		int currMax = nums[0];
		for(int i=1; i<nums.length;i++) {
			currMax = Math.max(currMax+nums[i], nums[i]);
			prevMax = Math.max(currMax, prevMax);
		}
		
		return prevMax;
	}

}
