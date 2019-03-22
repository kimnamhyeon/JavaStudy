
public class Test {
	public static void main(String[] args) {
		String data = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		data = "map";
		
		for(int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			char move_c = (char)(data.charAt(i) + 2);
			
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				if(c == 'Z' || c == 'z' || c == 'Y' || c == 'y') {
					System.out.print((char)(move_c - 26));
				} else {
					System.out.print(move_c);
				}
			} else {
				System.out.print(data.charAt(i));
			}
		}
	}
}
