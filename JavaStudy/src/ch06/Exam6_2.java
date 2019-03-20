package ch06;

public class Exam6_2 {
	int num = 10;
	
	public static void main(String[] args) {
		int score = 0;
		
		if(true) {
			int a = 10;
			score = a + 1000;
		}
		
		int n = 1000000;
		int total = getTotal(n);
		System.out.println("1 ~ " + n + " 까지의 합 : " + total);
	}

	// 메소드 작성
	public static int getTotal(int number) {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			total += i;
		}
		return total;
	}
}
