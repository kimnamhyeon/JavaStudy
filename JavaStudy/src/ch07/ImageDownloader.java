package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageDownloader {
	int 전역변수; // 클래스 영역
	Member m;
	int[] array;
	
	void method() {
		System.out.println(전역변수);
//		int 지역변수;
//		System.out.println(지역변수);
	}
	
	public static void main(String[] args) {
		// Shift + Ctrl + O(알파벳) : 전체 import
		
//		document.body.innerHTML = "for(int i = 0; i < 10; i++) {\r\n" + 
//				"			html += \"<input value='1'>\";\r\n" + 
//				"		}";
//		
//		
//		let html = "";
//		for(int i = 0; i < 10; i++) {
//			html += "<input value='1'>";
//		}
//		document.body.innerHTML = html;
		
	
		File outputFile = new File("c:/dev/test.jpg");
		 
		URL url = null;
		BufferedImage bi = null;
		        
		try {
		    url = new URL("http://www.bloter.net/wp-content/themes/denim/assets/images/bloter_headerlogo_744x180.png");
		    bi = ImageIO.read(url);
		    ImageIO.write(bi, "jpg", outputFile);
		 
		} catch (MalformedURLException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

	float 전역변수_실수; // 클래스 영역

}
	
	
	
	
	
	
	
