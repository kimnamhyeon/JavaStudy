package ch07.blood;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("��");
		human.setType('O');
		human.setAge(80);

		int age = 10;
		/* BloodHouse ��ü ���� */
		BloodHouse bh = new BloodHouse();
		
		
		String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		result = bh.action(human);
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}





