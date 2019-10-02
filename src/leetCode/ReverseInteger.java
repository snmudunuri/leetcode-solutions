package leetCode;

public class ReverseInteger {

	public static void main(String[] args) {
		/*
		 * We have to reverse a signed integer
		 * First check if the integer is negative or not
		 * 		if negative, create a variable and make it true and convert integer to positive
		 * 		else false
		 * Now for the logic part
		 * Create a long int variable 'reversed' equal to 0
		 * Now run while loop until given integer is greater than 0
		 * 		Change reversed value to = (reversed*10) + (x%10)
		 * 			reversed*10 - to make sure that we are adding the value to units, tenth, hundredth place etc.
		 * 			x%10 - to get the last digit from the number 
		 * 		Change the integer value to x = x/10;
		 * 			x/10 to eliminate the last digit since we already added that to the reversed integer
		 * Return 0 if reversed is greater than Integer.Max_value as that's the expected output
		 * Return reversed*(-1) if negative is true else return reversed
		 * 		Since reversed is a long variable, we cast this as int while returning 
		 */
		
		int n = -321;
		
		System.out.println(reverseInteger(n));

	}

	private static int reverseInteger(int n) {
		
		boolean negative = false;
		if(n<0) {
			negative = true;
			n *= -1;
		}
		
		long i = 0;
		
		while(n>0) {
			i = i*10 + (n%10);
			n /= 10 ;
		}
		
		if(i>Integer.MAX_VALUE) {
			return 0;
		}
		
		return negative ? (int)(i*(-1)) : (int) i;
	}

}
