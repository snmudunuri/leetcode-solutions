package leetCode;

import java.util.Stack;

public class ValidateStackSequences {

	public static void main(String[] args) {
		/*
		 * We can use this using stack
		 * We first push the current element
		 * Then run a while loop until stack is empty
		 * check if top element in stack is equal to the element at index i in popped
		 * if yes - pop the element and increment the popped index
		 * if no - break the loop 
		 * then run a loop from the index that's left over for popped array
		 * and keep popping the elements if it matches current integer in popped array
		 * finally return the value from stack.isEmpty()
		 */
		
		int[] pushed = {1,2,3,4,5};
		int[] popped = {4,5,3,2,1};
		System.out.println(validateStack(pushed, popped));

	}

	private static boolean validateStack(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<Integer>();
		int index=0;
		for(int i: pushed) {
			stack.push(i);
			while(!stack.isEmpty()) {
				if(stack.peek()==popped[index]) {
					stack.pop();
					index++;
				}
				else {
					break;
				}
			}
		}
		for(int i=index; i<popped.length;i++) {
			if(stack.peek()==popped[index]) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
