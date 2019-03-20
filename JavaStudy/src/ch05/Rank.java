package ch05;

public class Rank {
	public static void main(String[] args) {
		int[][] s = {
			{1, 2, 3, 4, 5},   // 0 
			{11, 12, 13}, // 1
			{21, 22, 23, 24}  // 2
		};
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		int i23 = s[2][2];
		System.out.println(i23);
		
		int i11 = s[1][0];
		System.out.println(s[1][0]);
	}
}







