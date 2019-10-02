package leetCode;

public class PowerOfThree {

	public static void main(String[] args) {
		/*
		 * We can run a while loop to calculate the power of 3 until it is less than given value
		 * Create an integer with value 1 (since 3^0 is 1) and start a while loop until it is less than target value
		 * We then compare it with given value to return true if it is equal else false 
		 */
		
		int i = 27;
		System.out.println(isPowerofThree(i));

	}

	private static Boolean isPowerofThree(int i) {
		
		long j = 1;
		
		while(j<i) {
			j *= 3;
		}
		
		return j==i ? true: false;
	}

}
