package leetCode;

import java.util.ArrayList;
import java.util.List;

public class GoatLatin {

	public static void main(String[] args) {
		/*
		 * Split the sentence at space and store it in the string array
		 * Create a temp string array
		 * Loop through the string array 
		 * Convert each string into character array and store all the characters into an array list
		 * Append the 'm','a' to the list if first character is vowel else remove the first character
		 * and append first character, 'm' and 'a'
		 * finally loop for i and add append 'a' to the list
		 * Create a char array and move all the elements from the array list to char array
		 * Convert char array to string 
		 * append the string to the temp string array
		 * Create String Builder object
		 * loop through the temp array and append the Strings to the Sentence with space 
		 * trim the final output and return the string
		 */
		String s = "I Speak Goat Latin";
		System.out.println(goatLatin(s));

	}

	private static String goatLatin(String S) {
		 String[] str = S.split(("\\s+"));
	        
	        String[] result = new String[str.length];
	        
	       for(int i=0; i< str.length; i++){
	            char[] chars = str[i].toCharArray();
	            
	           List<Character> al = new ArrayList<Character>();
	                for(char c : chars) {
	                al.add(c);
	                }
		      
	           
	           if(isVowel(chars[0]) ){
	               al.add('m');
	               al.add('a');
	           }
	           else{
	               al.add(chars[0]);
	               al.add('m');
	               al.add('a');               
	               al.remove(0);
	           }
	           for(int k=0; k<=i; k++){
	               al.add('a');
	           }
	          char[] temp = new char[al.size()];
	           for (int j = 0; j < al.size(); j++) { 
	  
	            // Assign each value to String array 
	            temp[j] = al.get(j); 
	        } 
	          result[i] =  new String(temp);
	       }
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < result.length; i++) {
	            stringBuilder.append(result[i] + ' ');
	        }
	        return stringBuilder.toString().trim();
		
	}

	private static boolean isVowel(char c) {
		 char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
         for(char i : vowels){
             if(i==c){
                 return true;
             }
             
         }
     return false;
	}

}
