package leetCode;

import java.util.HashMap;

public class MaximumNumberofBalloons {

	public static void main(String[] args) {
		/*
		 * We can solve this using HashMaps
		 * Create a hash map for the characters that forms word balloon
		 * and store their frequency in the map
		 * Now, loop through the map and created a nested if loop
		 * Go all the way to the end to create word balloon
		 * and as you progress reduce the frequency
		 * finally when you end the loop you'll have the count you need
		 */
		
		String s = "loonbalxballpoon";
		System.out.println(maximumNumberofBalloons(s));

	}

	private static int maximumNumberofBalloons(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: s.toCharArray()) {
			if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n') {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		int count =0;
		while(map.size()==5 && map.get('b')!=0) {
			 map.put('b',map.get('b')-1);
	            if(map.get('a')!=0){
	                map.put('a',map.get('a')-1);
	                if(map.get('l')>=2 && map.get('l')!=0){
	                    map.put('l',map.get('l')-2);
	                    if(map.get('o')>=2 && map.get('o')!=0){
	                        map.put('o',map.get('o')-2);
	                        if(map.get('n')!=0){
	                            map.put('n',map.get('n')-1);
	                            count =count+1;
	                        }
	                    }
	                }
		}
		
	}
		return count;
	}
}
