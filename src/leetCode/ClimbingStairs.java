package leetCode;

public class ClimbingStairs {

	public static void main(String[] args) {
		/*
		 * We can solve this using Dynamic Programming
		 * We can start with two sub problems and build the array based on those
		 * set values at 0 and 1 to 1
		 * Now start the solution by adding value at i-1 and i-2 to current index
		 * return value at index n
		 * 
		 */
		System.out.println(climbStaris(3)); 
	}

	private static int climbStaris(int i) {
		int[] stairs = new int[i+1];
		stairs[0] = 1;
		stairs[1] = 1;
		for(int n=2; n<=i; n++) {
			stairs[n] = stairs[n-1] + stairs[n-2];
		}
		return stairs[i];
	}

}
