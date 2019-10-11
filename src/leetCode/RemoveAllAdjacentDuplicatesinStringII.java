package leetCode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinStringII {
	
	/*
	 * We can do this using Stack queue concept
	 * Basically we will delete the characters if they occur k times adjacently
	 * So first initiate a stack
	 * Create two variable duplicate count and popping the elements
	 * Loop through char array of the string 
	 * 		We will push characters to the stack until our duplicate count variable equals to k
	 * 		We will increment the duplicate count whenever we see a duplicate char adjacent to previous one
	 * 			We can check this by peeking the stack to stay the last element pushed to the queue
	 * 		When the dupcount equals k, we pop the queue k times and set popping variable to 1
	 * 			After popping the element k times, we have to reset the dupcount variable and push the current char
	 * 		After this is done we have to consider the scenario where repeated characters are at the end of string
	 * 			For this case, after the loop we check if dupcount is equal to k or not
	 * 				if this condition satisfies we then pop out the last k elements again
	 * 		We then build the string using string builder
	 * 		We will return the string if there popping variable has not been changed to 1 even once in the entire loop
	 * 			Logic behind this, if popping variable remains 0, we didn't encounter k adjacent duplicates
	 * 		else we call the method recursively
	 */

	public static void main(String[] args) {
		String s= "yffbbbbnnnnffbgffffgbbbbgssssgthyyyy";
		int k =4;
		
		
		System.out.println(removeDuplicates(s, k));
	}

	private static String removeDuplicates(String s, int k) {
		int dupCount = 1;
		int poping = 0;
		
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			
			if(dupCount == k){
				
				poping = 1;
				for(int i=0; i<k; i++) {
					
				stack.pop();
				}
				dupCount=1;
				stack.push(c);
			}
			else if(stack.isEmpty() || stack.peek()!=c) {
				stack.push(c);
				dupCount = 1;
			}
			
			else {
				dupCount++;
				stack.push(c);
			}
		}
		if(dupCount==k) {
			poping = 1;
			for(int i=0; i<k; i++) {	
				stack.pop();
			}
			dupCount=1;
		}
		
		StringBuilder str = new StringBuilder();
		 for(char c: stack) { str.append(c); }
		 
		if(poping==0) {
			return str.toString();
		
		}
		else {
			return removeDuplicates(str.toString(),k);
		}
	}

}
