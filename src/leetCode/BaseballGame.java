package leetCode;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		/*
		 * We can solve this using stack
		 * Push the current as integer to the stack
		 * If string is C - pop the stack
		 * If string is D - peek the stack and push the double of peek int
		 * If string i + - pop the int and store in a temp variable
		 * peek the stack and store that in temp2 variable
		 * now push the temp back to stack
		 * push the temp+temp2 to the stack
		 * finally empty the stack in a loop and add each int to result
		 * return result
		 */
		String[] s = {"5","-2","4","C","D","9","+","+"};
		System.out.println(baseballResult(s));
	}

	private static int baseballResult(String[] s) {
		Stack<Integer> stack = new Stack<>();
		int result =0;
		for(String i: s) {
			if(i.equals("C")) {
				stack.pop();
			}
			else if(i.equals("D")) {
				stack.push(2*stack.peek());
			}
			else if(i.contentEquals("+")) {
				int curr = stack.pop();
				int curr2 = stack.peek();
				stack.push(curr);
				stack.push(curr+curr2);
			}
			else {
				stack.push(Integer.parseInt(i));
			}
		}
		while(!stack.isEmpty()) {
			result = result + stack.pop();
		}
		
		return result;
	}

}
