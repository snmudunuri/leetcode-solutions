package leetCode;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		/*
		 * Write a method to check if given character is Vowel or not
		 * Convert the given String to Char Array
		 * Take two indices one at 0 and other at array.length -1
		 * Loop through the char array until i<j
		 * logic is if both characters at i and j are vowels then we swap them
		 * else if character at i is vowel but not character at j; we decrement j by 1
		 * else if character at j is vowel but nor character at i; we increment i by 1
		 * else we increment both i and j
		 * Finally we return the char array as String
		 * 
		 */
		
		String s = "leetcode";
		System.out.println(reverseVowelsOfString(s));

	}

	private static String reverseVowelsOfString(String s) {
		
		char[] c = s.toCharArray();
		
		int i =0;
		int j = c.length-1;
		while(i<j) {
			if(isVowel(c[i]) && isVowel(c[j])) {
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				i++;
				j--;
				
			}
			else if(isVowel(c[i]) && !isVowel(c[j])){
				j--;
			}
			else if(!isVowel(c[i]) && isVowel(c[j])){
				i++;
			}
			else {
				i++;
				j--;
			}
			
		}
		
		return new String(c);
	}

	private static boolean isVowel(char c) {
		
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		for(char i: vowels) {
			if(i==c) {
				return true;
			}
		}
		
		return false;
	}

}
