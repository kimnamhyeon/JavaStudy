package ch06;

import java.util.Calendar;
import java.util.Scanner;

public class MethodExam1 {
	public static void main(String[] args) {
		Scanner s = null;
		s.hasNext();
		
		// 스태틱 키워드 미 사용시 (정상적인 인스턴스 사용)
//		MethodExam1 me = new MethodExam1();
//		me.printStar(4, '!');
		
		printStar(5, '★');
		
//		printStar(5, '★');
//		printStar(7, '@');
	}

	// method 메모리 영역에 등록
	static int a = 100;
	
	int b = 200;
	
	void m2() {
		
	}
	
	static int cc; // 전역변수
	
	public static void printStar(int count, char ch) {
		// 지역변수
		MethodExam1 m1 = new MethodExam1(); 
		m1.a = 10000;
		m1.cc = -111;
		m1.m2();
		Calendar c = Calendar.getInstance();
		
//		Calendar c = new Calendar();
		
		
		System.out.println(a);
//		Math m = new Math();
//		m.random();
		
		Math.random();
		
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
