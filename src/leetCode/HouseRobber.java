package leetCode;

public class HouseRobber {

	public static void main(String[] args) {
		/*
		 * This can solved using dynamic programming
		 * we build the solution based on sub problems
		 * Our base solutions will be 
		 * 	1. robbing at house 0 will give us profit of nums[0]
		 *  2. robbing at house 1 will give us profit of Max(nums[0], nums[1])
		 * Now we can iterate through array
		 * Store the max value between current number + number at index -2 and number at index -1
		 * return the value at last index
		 */
		int[] nums = {2,7,9,3,1};
		System.out.println(maxProfit(nums));
	}

	private static int maxProfit(int[] nums) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		if(nums.length==2) {
			return Math.max(nums[0], nums[1]);
		}
		
		int[] max = new int[nums.length];
		max[0] = nums[0];
		max[1] = Math.max(nums[0], nums[1]);
		for(int i=2; i<nums.length; i++) {
			max[i] = Math.max(nums[i]+max[i-2], max[i-1]);
		}
		return max[nums.length-1];
	}

}
