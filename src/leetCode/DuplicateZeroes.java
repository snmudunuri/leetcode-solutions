package leetCode;

public class DuplicateZeroes {

	public static void main(String[] args) {
		/*
		 * We can initiate a new array and add all the elements from given array to the new array
		 * We take two indices one for looping through new array and for adding zeroes to the given array
		 * Let's take givenArrayindex = 0 and newArrayIndexi=0
		 * Now we run a loop until index is less than the array length
		 * Logic:
		 * 		Step 1: 
		 * 			if integer at newArrayIndex is equal to 0 and givenArrayIndex is less than arr.length-1
		 * 			we add 0 to the given array at givenArrayindex and givenArrayindex +1 indices
		 * 			and move our givenArrayindex to givenArrayindex+2
		 * 		Step 2:
		 * 			if step 1 fails
		 * 			we add integer at newArrayIndexi in the new array to the given array at index givenArrayindex
		 * 			we increment at our givenArrayIndex by 1
		 * 		Step 3:
		 * 			We increment newArrayIndex by 1;
		 * 			
		 */
		
		int[] nums = {1,0,2,3,0,4,5,0};
		int[] output = modified(nums);
		for(int i: output) {
			System.out.println(i);
			
		}

	}

	private static int[] modified(int[] nums) {
		
		int[] newArr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			newArr[i] = nums[i];
		}
		int newArrayIndex = 0;
		int givenArrayIndex = 0;
		while(givenArrayIndex < newArr.length) {
			if(newArr[newArrayIndex]==0 && givenArrayIndex < newArr.length-1) {
				nums[givenArrayIndex] = 0;
				nums[givenArrayIndex+1] = 0;
				givenArrayIndex += 2;
			}
			else {
				nums[givenArrayIndex] = newArr[newArrayIndex];
				givenArrayIndex++;
			}
			newArrayIndex ++;
		}
		return nums;
	}

}
