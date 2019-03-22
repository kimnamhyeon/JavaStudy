package ch10;

public class Exam10_1 {
	public static void ³¿ºñ(Ramen ramen) {
		
	}
	public static void ³¿ºñ(SaltyRamen ramen) {
		
	}
	
	public static void main(String[] args) {
		Ramen ramen1 = new SpicyRamen("ºÒ ¶ó¸é");
		String taste1 = ramen1.getTaste();
		System.out.println(taste1);

		Ramen ramen2 = new SaltyRamen("¼Ò±Ý ¶ó¸é");
		String taste2 = ramen2.getTaste();
		System.out.println(taste2);
		
		³¿ºñ(ramen1);
		³¿ºñ(ramen2);
	}
}