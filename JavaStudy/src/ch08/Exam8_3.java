package ch08;

public class Exam8_3 {
	public static void main(String[] args) {
		System.out.println();
		
		
		Shop[] shop2 = {
			new Shop("��", "1", false),	
			new Shop("��", "1", false),	
			new Shop("��", "1", false),	
			new Shop("��", "1", false),	
			new Shop("��", "1", false),	
			new Shop("��", "1", false)	
		};
		
		
		// ���� 5�� ���� ����
		Shop[] shops = new Shop[5];
		// 1�� ����
		Shop s1 = new Shop();
		s1.setShopName("A");
		s1.setTelNum("001");
		s1.setHasParking(true);
		shops[0] = s1;

		// 2�� ����
		Shop s2 = new Shop("B", "002", false);
		shops[1] = s2;
		// 3�� ����
		shops[2] = new Shop("C", "003", true);
		// 4�� ����
		shops[3] = new Shop("D", "004", false);

		// 5�� ����
		shops[4] = new Shop("E", "005", true);
	}
}