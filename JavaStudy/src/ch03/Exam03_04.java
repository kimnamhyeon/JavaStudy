package ch03;

public class Exam03_04 {
	public static void main(String[] args) {
		int num = 456;
		// 1�� % ������ Ȱ��
//		int remain = num % 100;
//		num = num - remain;
		// 2�� ������, ���ϱ� Ȱ��
		num = num / 100 * 100;
		
		System.out.println( num );
		// ������, ���ϱ� ������ �̿�
	}
}
