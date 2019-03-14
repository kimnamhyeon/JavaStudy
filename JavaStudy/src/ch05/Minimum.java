package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = { 2100000001, 2100000002, 3, 1, -99 };
		
//		int temp = 2147483647; // int의 최대값
		int temp = Integer.MAX_VALUE;
		System.out.println(Long.MAX_VALUE);
		
		for(int i = 0; i < nums.length; i++) {
			if(temp > nums[i]) {
				temp = nums[i];
			}
		}
		System.out.println(temp);
	}
}





