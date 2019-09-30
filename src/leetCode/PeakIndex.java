package leetCode;

public class PeakIndex {

	public static void main(String[] args) {
		
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
