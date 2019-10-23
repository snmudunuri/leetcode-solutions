package leetCode;

public class Segregate0sAnd1sInAnArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int[] output = new int[arr.length];
		int index=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				output[index]=0;
				index++;
			}
		}
		for(int i=index; i<arr.length;i++) {
			output[i]=1;
		}
		
		for(int i: output) {
			System.out.println(i);
		}

	}

}
