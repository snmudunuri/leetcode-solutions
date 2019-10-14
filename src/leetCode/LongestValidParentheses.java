package leetCode;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		/*
		 * We can solve this using stack concept (LIFO)
		 * We initiate a stack of Integers to start with
		 * We then push -1 to the stack to avoid exceptions of empty stack while pushing the indices
		 * We loop through the chararray of string
		 * We take each character and add the index to the stack when we see '('
		 * if current char is not '('
		 *		we pop the char from c 
		 *		after popping the char, if stack is empty we add the current index to the stack
		 *		else
		 *		we get the max value between current max and (current index- top index from the stack)
		 * We return the max value finally
		 * 
		 * Ex: "((()()" - answer should 4
		 * So we intiate the stack by pushing -1 and max =0
		 * Iteration 1: char = '(', i=0
		 * 		we push 0 to stack 
		 * 		so current stack is -1,0
		 * Iteration 2: char '(', i=1
		 * 		we push 1 to stack 
		 * 		so current stack is -1,0,1
		 * Iteration 3: char'(', i =2
		 * 		we push 2 to stack
		 * 		so current stack is -1,0,1,2
		 * Iteration 4: char')', i=3
		 * 		since char is not '(' we pop the stack
		 * 		so we remove 2 from the stack and our top index would 1 now
		 * 		stack is not empty so we will calculate max value
		 * 		max = Math.max(max, 3-1) = 2 since max is 0
		 * Iteration 5: char'(', i=4, max =2
		 * 		we push 4 to the stack and stack would be -1,0,1,4
		 * Iteration 6: char')', i=5, max =2
		 * 		we remove the top index and our next top element would be 1
		 * 		now max = Math.max(2, 5-1) = 4
		 * We return 4 finally
		 * 		
		 * 
		 */
		
		String s = "((()()";
		System.out.println(longestValidParentheses(s));

	}
	
	 public static int longestValidParentheses(String s) {
	        char[] chars = s.toCharArray();
	        Stack<Integer> stack = new Stack<Integer>();
	        int max =0;
	        stack.push(-1);
	        for(int i=0; i<chars.length; i++){
	            if(chars[i]=='('){
	                stack.push(i);
	            }
	            else{
	                stack.pop();
	                if(stack.isEmpty()){
	                    stack.push(i);
	                }
	                else{
	                    max = Math.max(max, i-stack.peek());
	                }
	            }
	        }
	        return max;
	        
	    }
}

