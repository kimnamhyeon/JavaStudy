package ch06;

import java.util.Scanner;

public class MethodExam1 {
	public static void main(String[] args) {
		Scanner s = null;
		s.hasNext();
		
		// ����ƽ Ű���� �� ���� (�������� �ν��Ͻ� ���)
//		MethodExam1 me = new MethodExam1();
//		me.printStar(4, '!');
		
		printStar(5, '��');
		
//		printStar(5, '��');
//		printStar(7, '@');
	}

	// method �޸� ������ ���
	static int a = 100;
	
	int b = 200;
	
	void m2() {
		
	}
	
	public static void printStar(int count, char ch) {
		MethodExam1 m1 = new MethodExam1(); 
		m1.m2();
		
		System.out.println(a);
		
		MethodExam1 m = new MethodExam1();
		System.out.println(m.b);
		
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
