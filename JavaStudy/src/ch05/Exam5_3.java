package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 
			'a', 'b', 'c', 'd', 'e', 'f', 'g' 
		};
		for (int i = 0; i < 10000; i++) {
			int random = (int) (Math.random() * nums.length);
			char temp = 0;
			temp = nums[0];
			nums[0] = nums[random];
			nums[random] = temp;
		}

		System.out.println(nums);

	}
}
