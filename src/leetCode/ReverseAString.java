package leetCode;

public class ReverseAString {

	public static void main(String[] args) {
		/*
		 * Take two indices i=0 and j = length -1
		 * Now loop through the array until i<j and swap the characters
		 */
		
		char[] input = {'h','e','l','l','o'};
		char[] output = reverseString(input);
		
		for(char i: output)
		System.out.println("Reversed string is: " + i );

	}

	private static char[] reverseString(char[] input) {
		
		int left = 0;
		int right = input.length-1;
		while(left<right) {
			char temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}
		
		return input;
	}

}
