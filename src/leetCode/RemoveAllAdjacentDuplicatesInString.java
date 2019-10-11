package leetCode;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		/*
		 * Let's do this using stringBuilder method
		 * Create a string builder object for the given string
		 * Loop through the array length -1
		 * If you find character at index i is equal to char at index i+1
		 * 		You delete the char at i and i+1
		 * 		you can use string builder delete method to delete char at indices given
		 * 		return the method again with new string to call it recursively
		 * Finally return the string using toString method for string builder 
		 */
		
		String S = "abbaca";
		System.out.println(removeDuplicates(S));

	}

	private static String removeDuplicates(String s) {
		
		StringBuilder str = new StringBuilder(s);
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				str.delete(i, i+2);
				return removeDuplicates(str.toString());
			}
		}
		
		
		return str.toString();
	}

}
