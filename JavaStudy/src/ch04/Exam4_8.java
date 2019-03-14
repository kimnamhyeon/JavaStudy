package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 33; i++) {
			// i == 3 
			int num = i;
			while(num > 0) {
				// 13   31
				int n = num % 10;   // 3    1    3
				if(n == 3) {
					System.out.println(i);
					count++;
					break;
				}
				num = num / 10;   // 3
			}
		}
		System.out.println(count);
	}
}




