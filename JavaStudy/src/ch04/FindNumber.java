package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		// ���Ѳ� ���� ���� ����
		//                 0.0 ~  < 1.0 
		//                           0.99999
		//         * 100   0.0  ~  99.9999999999
		int random = (int) (Math.random() * 100) + 1;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt(); // ����� �Է°�
			if(random == num) {
				System.out.println("������");
				break;
			} else if(random > num) {
				System.out.println("�� ū���� �Է��ϼ���.");
			} else {
				System.out.println("�� �������� �Է��ϼ���.");
			}
		}
	}
}










