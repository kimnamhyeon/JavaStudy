package ch08;

public class Shop {
	String shopName;
	String telNum;
	boolean hasParking;

	// �⺻ ������ �ۼ�
	public Shop() {}

	public Shop(String shopName, String telNum, boolean hasParking) {
		super();
		this.shopName = shopName;
		this.telNum = telNum;
		this.hasParking = hasParking;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public boolean isHasParking() {
		return hasParking;
	}

	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}

	// �Ű����� 3�� ������ �ۼ�
	
	// shopName, telNum, hasParking �� getter / setter �޼ҵ� �ۼ�
	
}