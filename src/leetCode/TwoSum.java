package leetCode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		/*
		 * Explanation:
		 * Loop through the array and subtract the current number from target
		 * If the result in above operation exists in HashMap retrieve the value of that key
		 * else store the current number as key and it's index as value.
		 */
		
		int[] input = {2, 7, 11, 5};
		int target = 9;
		int[] answer = twoSum(input, target);
		
		System.out.println("Two sum output is: " + answer[0] + "," + answer[1]);
		

	}

	private static int[] twoSum(int[] input, int target) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> map = new HashMap();
		int[] result = new int[2];
		
		for(int i=0; i<input.length; i++) {
			if(map.containsKey(target-input[i])) {
				result[0] = map.get(target-input[i]);
				result[1] = i;
			}
			else {
				map.put(input[i], i);
			}
		}
		
		return result;
	}

}
