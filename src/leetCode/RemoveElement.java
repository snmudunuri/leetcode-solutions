package leetCode;

public class RemoveElement {

	public static void main(String[] args) {
		/*
		 * Define an index and initialize it with 0;
		 * Loop through the array
		 * Check if integer at current index is not equal to the target value
		 * If it is not equal, then place that integer at the defined index variable and increment the index by 1
		 * Finally return the index value
		 */
		
		int[] input = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(input, val));

	}

	private static int removeElement(int[] input, int val) {
		
		int index =0;
		for(int i: input) {
			if(i!=val) {
				input[index] = i;
				index++;
			}
		}
		
		return index;
	}

}
