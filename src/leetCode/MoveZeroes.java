package leetCode;

public class MoveZeroes {

	public static void main(String[] args) {
		/*
		 * You can not create a new array as per the question
		 * Initialize an index to 0
		 * loop through the input array and if current integer is not zero then add current integer to input[index]
		 * increment the index 
		 * Now run a loop from the index until the input array length and add zeroes to the array
		 * Return the input array
		 */
		int[] input = {0,1,0,3,12};
		int[] output = moveZeroes(input);
		for(int i:output) {
			System.out.println(i);
		}

	}

	private static int[] moveZeroes(int[] input) {
		int index=0;
		for(int i =0; i<input.length;i++) {
			if(input[i]!=0) {
				input[index] = input[i];
				index++;
			}
		}
		for(int j=index; j<input.length;j++) {
			input[j] = 0;
		}
		
		return input;
	}

}
