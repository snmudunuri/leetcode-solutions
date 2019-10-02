package leetCode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		/*
		 * We can implement this using stack
		 * To check if parentheses are properly closed, first closed parentheses should equal to the last open parentheses
		 * This is nothing but last in first out concept
		 * So, we convert the given String to char array
		 * Whenever we see a open parentheses we store that in the stack
		 * Whenever we see a closed parentheses we peek the value that is to be popped and check if it matches the expected char
		 * if peek of stack doesn't match with value we are expecting we return false
		 * Final we return true if stack is empty
		 */
		
		String s = "()[{}";
		
		System.out.println(isValidParentheses(s));

	}

	private static Boolean isValidParentheses(String s) {
		char[] chars = s.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char i: chars) {
			if(i == '(' || i == '{' || i == '[') {
				stack.push(i);
			}
			else if( i == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if( i == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
			else if( i == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}
			else {
				return false;
			}
		}
		
		
		return stack.isEmpty();
	}

}
