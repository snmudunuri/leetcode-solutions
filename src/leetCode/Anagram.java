package leetCode;

public class Anagram {

	public static void main(String[] args) {
		String str1  = "anagram";
		String str2 = "nagaram";
		System.out.println(isAnagram(str1,str2));

	}

	private static Boolean isAnagram(String str1, String str2) {
		char[] s1= str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int[] chars = new int[26];
		
		if(s1.length!=s2.length) {
			return false;
		}
		
		for(int i=0; i<s1.length;i++) {
			chars[s1[i]-'a']++;
			chars[s2[i] - 'a']--;
			
		}
		for(int i: chars) {
			if(i!=0) {
				return false;
			}
		}
		
		
		return true;
	}

}
