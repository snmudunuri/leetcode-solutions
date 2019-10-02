package leetCode;

public class PlusOne {

	public static void main(String[] args) {
		/*
		 * We have to add 1 to the last digit and return the new array
		 * But if the last digit is 9 then we make that 0 and increment the previous digit by 1
		 * We loop backwards through the array and increment the digit if it is not 9 and return the array
		 * else we just make it 0 and move to the previous digit and continue till end
		 * If we did not return anything in the loop then 
		 * we create a new array with size of input array size +1 as we need to input one extra digit
		 * Initially it will be initiated by all 0's
		 * so all we need to do is to set the first index to 1 and return the result
		 */
		
		int[] i = {9,9,9};
		int[] output = plusOne(i);
		for(int k: output) {
			System.out.println(k);
		}

	}

	private static int[] plusOne(int[] input) {
		// TODO Auto-generated method stub
		for(int j= input.length-1; j>=0; j-- ) {
			if(input[j]<9) {
				input[j]++;
				return input;
			}
			input[j] = 0;
		}
		
		int[] result = new int[input.length+1];
		result[0] = 1;
		return result;
	}

}
