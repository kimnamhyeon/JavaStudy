package ch07;

// �ڷ����� ����
// �ݵ�� ������ ����
// �� ������ ���� ������ �� �ִ� �޼ҵ尡 ����

// Java Bean (POJO : Plain Old Java Object)
public class Notebook {
	int price;
	String brand;
	float size;

	
	public void print() {
		System.out.println(price + brand + size);
	}
	
	// set ���� �޼ҵ� / get ���� �޼ҵ�
	public void setSize(float size) {
		this.size = size;
	}
	public float getSize() {
		return size;
	}
	
	public void setBrand(String s) {
		brand = s;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
}







