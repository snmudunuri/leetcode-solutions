package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		/*
		 * Solve it using the int array which contains 
		 * the row number for each character
		 * I initialized an array of size 26 with each character's row as value
		 */
		
		 String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		 String[] out = isOnSameRow(words);
		 for(String s: out) {
			 System.out.println(s);
		 }

	}

	private static String[] isOnSameRow(String[] words) {
		 int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
		 List<String> list = new ArrayList<>();
		 for(String s: words) {
			 String a = s.toLowerCase();
			 boolean isValid = true;
			 int row = rows[a.charAt(0)-'a'];
			 for(int i=1; i<a.length();i++) {
				 if(rows[a.charAt(i)-'a']!=row) {
					 isValid = false;
					 break;
				 }
			 }
			 if(isValid) {
				 list.add(s);
			 }
		 }
		return list.toArray(new String[0]);
	}

}
