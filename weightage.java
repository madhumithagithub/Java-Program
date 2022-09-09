package array;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		
		int[] nums = {49,36,8,10,12};
		
		int[][] res = new int[nums.length][];
		
		for (int i=0; i<nums.length; i++) {
			int weight = 0;
			if (Math.floor(Math.sqrt(nums[i])) - Math.sqrt(nums[i]) == 0) {
				weight += 5;
			}
			if (nums[i]%4 == 0 && nums[i]%6 ==0) {
				weight += 4;
			}
			if (nums[i]%2 == 0) {
				weight += 3;
			}
			res[i] = new int[] {nums[i], weight};
		}
		
		sortOnWeight(res);
		
		System.out.println(Arrays.deepToString(res)); // [[36, 12], [12, 7], [49, 5], [10, 3], [8, 3]]

	}
	
	static void sortOnWeight(int[][] arr) {		

		Arrays.sort(arr, (a1,a2) -> (Integer.compare(a2[1], a1[1]) == 0 ? 
										Integer.compare(a2[0], a1[0]): 
										Integer.compare(a2[1], a1[1])));
		
	}

}