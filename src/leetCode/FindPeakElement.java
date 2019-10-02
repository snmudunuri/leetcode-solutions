package leetCode;

public class FindPeakElement {

	public static void main(String[] args) {
		/*
		 * Explanation:
		 * Take two indices left and right
		 * Take mid index = left + (right-left)/2
		 * Now loop through the array until left is less than right
		 * In every loop check if mid value is less than the mid+1 value
		 * 	- if above returns true we should move our left index to the mid +1 and do the check again
		 * 	- else move our right index to mid
		 * Our final left or right index will contain the same index logically and we return left or right.
		 */
		
		int[] input = {1,2,1,3,5,6,4};
		
		System.out.println(findPeakElement(input));

	}

	private static int findPeakElement(int[] input) {
		
		int left = 0;
		int right = input.length-1;
		
		while(left< right) {
			int mid = left + (right-left)/2;
			if(input[mid]< input[mid+1]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}

}
