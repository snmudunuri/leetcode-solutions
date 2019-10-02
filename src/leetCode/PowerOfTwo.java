package leetCode;

public class PowerOfTwo {

	public static void main(String[] args) {
		/*
		 * We can run a while loop to calculate the power of 2 until it is less than given value
		 * Create an integer with value 1 (since 2^0 is 1) and start a while loop until it is less than target value
		 * We then compare it with given value to return true if it is equal else false 
		 */
		
		int input = 16;
		
		System.out.println(isPowerOfTwo(input));
	
	}

	private static Boolean isPowerOfTwo(int input) {
		
		long i = 1;
		
		while(i<input) {
			i *= 2;
		}
		
		return i==input ? true: false;
	}

}
