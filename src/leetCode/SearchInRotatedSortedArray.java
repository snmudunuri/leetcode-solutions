package leetCode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		/*
		 * Given array is a sorted array but there's a pivot on which it's rotated
		 * so elements to the left and right of pivot are sorted
		 * First let's find the minimum value index in the array using the binary search
		 * Once we get the minimum value index or pivot index let's make that as our start index
		 * and reset the left to 0 and right to length-1
		 * Now let's check if the target value is between the pivot index and end of the array
		 * 		if the above is true, we set our left index equals to start
		 * 		else we set right index equals to start
		 * Now all we need to do is a binary search 
		 * Using the left and right indices we run a while loop until left<=right
		 * return mid index when nums[mid] equals the target
		 * return -1 if loop terminates without any value
		 */
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(indexOfTarget(nums, target));

	}

	private static int indexOfTarget(int[] nums, int target) {
		 if(nums == null || nums.length ==0){return -1;} //return -1 when input is null
		int left =0;
		int right = nums.length-1;
		while(left<right) {
			int mid = left + (right-left)/2;
			if(nums[mid]>nums[right]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		
		int start = left;
		left =0;
		right = nums.length-1;
		if(target >= nums[start] && target<= nums[right]) {
			left = start;
		}
		else {
			right = start;
		}
		
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
			
		}
		
		
		return -1;
	}

}
