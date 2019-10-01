package leetCode;

import java.util.ArrayList;
import java.util.List;
public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Loop through the array to check if number is divisible by 3 or 5 or 15
		 * and return appropriate return statement
		 */
		
		int n =15;
		List<String> output = fizzBuzz(n);
		
		for(String i: output) {
			System.out.println(i);
		}

	}

	private static List<String> fizzBuzz(int n) {
		 List<String> result = new ArrayList<String>();
	        for(int i=1; i<=n ; i++){
	            if(i%15 == 0){
	                result.add("FizzBuzz");
	            }
	            else if(i%3 == 0){
	                result.add("Fizz");
	            }
	            else if(i%5 == 0){
	                result.add("Buzz");
	            }
	            else{
	                result.add(Integer.toString(i));
	              }
	        }
	        return result;
	}

}
