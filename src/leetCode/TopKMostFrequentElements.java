package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKMostFrequentElements {

	public static void main(String[] args) {
		/*
		 * We can do this using HashMaps and Priority Queue concept
		 * We store the characters with their frequencies as key and value pair using Hash Map
		 * Now we create a priority queue based on the logic 
		 * 		Given two chars, I need to prioritize between their frequency values
		 * 		Which (a,b) -> freq(b) - freq(a)
		 * This create a max priority queue
		 * Now we create an array list
		 * Loop through the priority queue until k and store the value to the list
		 * Now return the list.
		 */
		
		
		int[] input = {1,1,1,2,2,3,3,3,3,3,4};
		int k=2;
		List<Integer> output = topKMostFrequent(input, k);
		for(int i: output) {
			System.out.println(i);
		}

	}

	private static List<Integer> topKMostFrequent(int[] input, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for( int i: input) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
		queue.addAll(map.keySet());
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<k; i++) {
			list.add(queue.remove());
		}
		
		return list;
	}

}
