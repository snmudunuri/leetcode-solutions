package leetCode;

import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		/*
		 * We can use stack for this problem.
		 * With stack we can implement Last In First Out operation
		 * So whenever we see a character that matches # we pop the element from the stack and 
		 * that removes last entered character from the stack
		 * Finally we will have a stack with all the characters
		 * Now, we loop through one stack and check if character at index i in both the stacks are equal or not.
		 */
		
		String S = "a#c";
		String T = "b";
		
		System.out.println(backSpaceStringCompare(S,T));


	}

	private static Boolean backSpaceStringCompare(String s, String t) {
		
		Stack<Character> stackS = new Stack<Character>();
		Stack<Character> stackT = new Stack<Character>();
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		
		for(char c: s1) {
			if(c == '#') {
				stackS.pop();
				
			}
			else {
				stackS.push(c);
			}
		}
		for(char c: s2) {
			if(c == '#') {
				stackT.pop();
				
			}
			else {
				stackT.push(c);
			}
		}
		
		if(stackS.size()!=stackT.size()) {
			return false;
		}
		
		for(int i=0;i<stackS.size();i++) {
			if(stackS.get(i)!=stackT.get(i)) {
				return false;
			}
		}
		
		return true;
	}

}
