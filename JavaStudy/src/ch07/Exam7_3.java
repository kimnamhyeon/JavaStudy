package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3�� method1() ȣ�� */
		Class7_3.method1();
	}
}

class Class7_3 {
	int a;  // �������� �ڵ����� �ʱ�ȭ 0����..

	public static void method1() {
		System.out.println("method1 ���� ����");
		// 5�� ���� -> �ν��Ͻ� 1���� �۾�
		Class7_3 c = new Class7_3();
		for (int i = 0; i < 5; i++) {
			c.method2();
		}
		System.out.println("method1 ���� ����");
	}

	public void method2() {
//		a = 0;
		a++;
		System.out.println(a);
	}
}





