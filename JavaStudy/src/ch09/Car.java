package ch09;

public class Car {
	int tire = 4;
	int door = 2;
	
	// 1. ������� �������̵带 �ߴ� ��� ����� �˷��ֱ� ���ؼ�
	// 2. �������̵带 �ϸ鼭 ��Ÿ �߻��� ���� �Ǽ��� �����ϱ� ���ؼ�
	@Override // �ֳ����̼� Annotation
	public String toString() {
		return tire + "  " + door;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		String content = c1.toString();
		System.out.println(content);
	}

	Car() {
		System.out.println("Car ��ü ����");
	}

	void move() {
		System.out.println("�̵�");
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
}