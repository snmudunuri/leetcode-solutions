package leetCode;

public class BestTimeToBuyStock {

	public static void main(String[] args) {
		/*
		 * We can solve this with a very easy logic
		 * Take two variables min and max. Set min to the Integer Max Value and max to 0
		 * Loop through the given int array
		 * Check if current integer is less than min value. If yes, store the integer in min variable
		 * Else store the Maximum value of max and (Current integer - min) in the max varaible
		 * finally return the max
		 */
		
		int[] input = {7,1,5,3,6,4};
		System.out.println(bestTimeToBuyStock(input));

	}

	private static int bestTimeToBuyStock(int[] input) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i: input) {
			if(i< min) {
				min = i;
			}
			else {
				max = Math.max(max, i-min);
			}
		}
		
		return max;
	}

}
