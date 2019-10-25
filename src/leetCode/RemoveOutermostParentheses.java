package leetCode;

public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		/*
		 * Key logic is number of open braces equals to number of close braces
		 * So when we have that equal count we append everything except first and last 
		 * characters
		 */
		
		String s = "(()())(())(()(()))";
		System.out.println(removeOuter(s));

	}

	private static String removeOuter(String s) {
		StringBuilder strBuild = new StringBuilder(s.length());
		int count =0;
		for(char c: s.toCharArray()) {
			if(c=='(' && count==0) {
				count=1;
			}
			else {
				count = c=='(' ? count+1 : count-1;
				if(count!=0) {
					strBuild.append(c);
				}
			}
		}
		return strBuild.toString();
	}

}
