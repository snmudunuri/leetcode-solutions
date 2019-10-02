package leetCode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		/*
		 * Take a variable index = 0
		 * Loop through the input array starting at index j=1
		 * Check if value at index is equal to value at j
		 * if it is not equal increment the index value and add the value at j to the value at index
		 * We increment the index before storing the value because we are starting at 0 and we should start placing the value from index 1
		 * Finally return the index+1 value
		 */
		
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(input));
	}

	private static int removeDuplicates(int[] input) {
		
		int index =0;
		for(int j=1; j< input.length; j++) {
			if(input[j]!=input[index]) {
				index++;
				input[index] = input[j];
							
			}
		}
		
		
		return index+1;
	}

}
