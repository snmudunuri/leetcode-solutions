package leetCode;

public class PeakIndex {

	public static void main(String[] args) {
		/*
		 * Explanation:
		 * We can do this binary search
		 * Take two indices left and right
		 * Take mid index using the left and right index
		 * Now loop through the array until left is less than right
		 * In every loop check if mid value is less than the mid+1 value
		 * 	- We are checking this because if mid value is less than 
		 * 	  mid +1 value, that means we are still in the ascending order of the array
		 * 	  so we should move our left index to the mid +1 and do the check again
		 * If mid value is greater than mid +1 value then we move our right index to the mid value
		 * 	- Since we have our mid greater than mid +1 we need to move our right index
		 * Our final left or right index will contain the same index logically and we return left or right.
		 */
		
		int[] input = {0,2,1,0};
		
		System.out.println("Peak Index is: " + peakIndex(input));

	}

	private static int peakIndex(int[] input) {
		
		int left = 0;
		int right = input.length-1;
		
		while(left<right) {
			int mid = left + (right-left)/2;
			if(input[mid]<input[mid+1]) {
				left = mid +1;
			}
			else {
				right = mid;
			}
		}
		return right;
		
	}

}
