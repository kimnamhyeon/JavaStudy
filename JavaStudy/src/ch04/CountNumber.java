package ch04;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ�. => ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			int n = i;
			while(n > 0) {
				int n2 = n % 10;
				if(n2 == 8) {
					// Ƚ�� ����
					count++;
				}
				n = n / 10;
			}
		}
		System.out.println(count);
	}
}








