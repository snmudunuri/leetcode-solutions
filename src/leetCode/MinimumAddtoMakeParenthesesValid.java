package leetCode;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {

	public static void main(String[] args) {
		/* 
		 * We can solve this using stack
		 * we push to stack when we see open parentheses
		 * if stack is not empty We pop when we see closed parentheses 
		 * else we increment our count of closed parentheses
		 * Finally we return the count and the size of stack
		 */
		String s = "()))((";
		System.out.println(minimumAdd(s));
	}

	private static int minimumAdd(String s) {
		Stack<Character> stack = new Stack<>();
		int count = 0;
		for(char c: s.toCharArray()) {
			if(c=='(') {
				stack.push(c);
			}
			else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else {
					count++;
				}
			}
		}
		return count+stack.size();
	}

}
