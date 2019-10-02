package leetCode;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		/*
		 * Duplicate can be solved using HashMaps or HashSets
		 * We loop through the array and we return false if integer already exists in the map or set
		 */
		
		int[] input = {1,2,3,1};
		System.out.println(containsDuplicate(input));

	}

	private static Boolean containsDuplicate(int[] input) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: input) {
			if(set.contains(i)) {
				return true;
			}
			else {
				set.add(i);
			}
		}
		
		return false;
	}

}
