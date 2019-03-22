package ch12;

public class IndexOf {
	public static void main(String[] args) {
		//             0123456789
		String text = "mLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempo";
		int index = -1;
		
		while(true) {
			index = text.indexOf("ipsum", index + 1);
			System.out.println(index);
			if(index == -1) {
				break;
			}
		}
	}
}


