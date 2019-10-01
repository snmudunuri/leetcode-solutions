package leetCode;

import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		/*
		 * To get the unique number we can use sets as set is a data structure that contains unique elements
		 * We add to the set when we don't find the number in set else we remove that number from the set
		 * Finally we return the set as it contains only the unique number
		 */
		
		int[] input = {4,1,2,1,2};
		
		System.out.println("Unique number is: " + uniqueNumber(input));

	}

	private static int uniqueNumber(int[] input) {
		
		HashSet<Integer> set = new HashSet();
		for(int i: input) {
			if(set.contains(i)) {
				set.remove(i);
			}
			else {
				set.add(i);
			}
		}
		int i=0;
		for(int j: set) {
			i = j;
		}
		return i;
	}

}
