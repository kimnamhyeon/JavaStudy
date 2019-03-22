package ch12;

public class 간식 {
	public static void main(String[] args) {
		String[] 목록 = {
			"붕어싸만코", "붕어싸만코 녹차", "콘", "빵빠레", 
			"빵빠레초코", "빵빠레그린요거트", "프렌치카페"
		};
		String[] 구매품목 = new String[28];
		// 랜덤 품목 추출
		for(int i = 0; i < 28; i++) {
			int random = (int)(Math.random() * 목록.length);
			String 품목 = 목록[random];
			구매품목[i] = 품목;
		}
		
		// 배열값 확인
		for(int i = 0; i < 28; i++) {
			System.out.println(구매품목[i]);
		}
		
	}
}





