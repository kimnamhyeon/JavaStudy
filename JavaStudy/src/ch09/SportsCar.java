package ch09;

import ch07.blood.Human;

public class SportsCar extends Car {
	char color = 'R';
	String s;
	
	@Override  // ����
	void move() {
		System.out.println("������ī �̵� �ü� 300km");
	}

	SportsCar() {
		System.out.println("SportsCar ��ü ����");
		Object obj = null;
		Human human4 = null;
		Human human3 = null;
		Human human2 = null;
		Human human1 = null;
		
		Object[] ob = { human1, human2 };
		
	}

	void openSunloof() {
		System.out.println("����� ����");
	}
}









