package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Constant {
	public static void main(String[] args) {
		JFrame j = new JFrame("�� â");
		
		JButton b = new JButton("�� ��ư");
		b.setBackground(Color.CYAN);
		
		j.add(b); // �����ӿ� ��ư�� ����?
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setDefaultCloseOperation(3);
		j.setSize(300, 200); // �ʺ� 300, ���� 200
		j.setVisible(true);
	}
}





