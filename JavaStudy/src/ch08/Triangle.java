package ch08;

public class Triangle {
	float bottom;
	float height;

	// �⺻ ������ �ۼ�
	public Triangle() {}

	// �Ű����� 2�� ������ �ۼ�
	public Triangle(float bottom, float height) {
		this.bottom = bottom;
		this.height = height;
	}

	// getArea �޼ҵ� �ۼ�
	public float getArea() {
		return this.bottom * height * 0.5f;
	}

	public float getBottom() {
		return bottom;
	}

	public void setBottom(float bottom) {
		this.bottom = bottom;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	// bottom, height �� getter / setter �޼ҵ� �ۼ�
}




