package leetCode;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * In the problem it was given that, array contains distinct integers between 0 to n
		 * n is length of the array and since it started with 0
		 * with missing element size should be n+1
		 * with Gauss law, sum of n natural numbers (1 to n) is (n*n+1)/2
		 * since we are starting with 0 it would (n*(n-1))/2
		 * so we will use this formula to solve the problem
		 * using length we know what would be the total value
		 * we just have to subtract that actual sum we got from expected total to get the missing number 
		 */
		
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));

	}

	private static int missingNumber(int[] nums) {
		int sum=0;
		for(int i: nums) {
			sum += i;
		}
		int n = nums.length+1;
		return ((n*(n-1))/2)-sum;
	}

}
