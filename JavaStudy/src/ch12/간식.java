package ch12;

public class ���� {
	public static void main(String[] args) {
		String[] ��� = {
			"�ؾ�θ���", "�ؾ�θ��� ����", "��", "������", 
			"����������", "�������׸����Ʈ", "����ġī��"
		};
		String[] ����ǰ�� = new String[28];
		// ���� ǰ�� ����
		for(int i = 0; i < 28; i++) {
			int random = (int)(Math.random() * ���.length);
			String ǰ�� = ���[random];
			����ǰ��[i] = ǰ��;
		}
		
		// �迭�� Ȯ��
		for(int i = 0; i < 28; i++) {
			System.out.println(����ǰ��[i]);
		}
		
	}
}





