package ch10;

public class SaltyRamen extends Ramen { // ��� �ڵ�
	public SaltyRamen(String name) {
		super.name = name;
	}
	// �������̵� �ڵ�
	public String getTaste() {
		return name + " §��";
	}
}