package ch09;

public class InheritanceExam2 {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		Car c = null;
		c = (Car) sc; // ��ĳ����
		c.move();

		SportsCar sc2 = (SportsCar) c; // �ٿ�ĳ����
		sc2.openSunloof();
		Car c2 = new Car();
		SportsCar sc3 = null;
//		sc3 = (SportsCar) c2; // Car ��ü�� �����Ǿ��� ������ ����
		if (c2 instanceof SportsCar) {
			sc3 = (SportsCar) c2;
			sc3.openSunloof();
		} else {
			System.out.println("ĳ���� �Ұ�!");
		}
	}
}