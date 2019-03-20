package ch06;

import java.util.Arrays;

public class MethodExam6 {
	public static void main(String[] args) {
		int num = 5;
		int[] nums = { 5 }; // 0x9828
		a(num);
		b(nums);
		System.out.println(num); // 5
		System.out.println(nums[0]); // 150
	
	}
	public static void a(int num) {
		num = num * 30;
	}
	public static void b(int[] nums) { // 
		nums[0] = nums[0] * 30;
	}
}


