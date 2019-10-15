package leetCode;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 * If given number is < 0 or
		 * (number%10 == 0 (if number is 10,100,...) and number!=0) 
		 * return false straight away
		 * Now reverse the integer
		 * finally check if reversed integer and given integer are equal and return the output
		 * 
		 */
		int[] nums = {121, -121, 100, 0, 12};
		for (int i: nums) {
			System.out.println(isPalindrome(i));
		}

	}

	private static Boolean isPalindrome(int i) {
		if(i<0 || (i%10==0 && i!=0)) {
			return false;
		}
		
		return reverse(i)==i? true:false;
	}

	private static int reverse(int i) {
		int x = 0;
		while(i>0) {
			x = x*10 + i%10;
			i /= 10;
		}
		return x;
	}

}
