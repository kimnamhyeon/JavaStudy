package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.getAge(); // ���� ��
		
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if(age >= 16 && age <= 69) {
			isPossible = true;
		}
		
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����
		
		boolean isPossible = isPossible(human);
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
//		if(isPossible(human)) { }
		
		if(isPossible) {
			result = "������ �Ϸ�Ǿ����ϴ�. " + human.getName() + "�� �����մϴ�.";
		} else {
			result = "������ �Ұ����մϴ�.";
		}
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		return result;
	}
}







