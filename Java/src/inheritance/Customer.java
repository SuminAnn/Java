package inheritance;

public class Customer {
	

	/*
	 상속 : class를 정의 할 때 이미 구현된 class를 상속 받아서 속성이나 기능이 확장되는 class를 구현
	  - extends 뒤에는 단 하나의 class만 사용할 수 있다.
	  - 자바는 single inheritance만을 지원한다.
	  - 상속은 항상 코드의 재사용의 방법으로 생각하면 안된다.
	  - 하위class가 생성이 되기전 상위class가 먼저 생성이 된다.
	 
	 업캐스팅(상위 클래스로의 묵시적 형 변환)
	  - Customer cs = new VIPCustomer();가 가능하다.
	 */
	
	protected int customerID;	//protected는 상속관계에서는 패키지가 달라도 public으로 적용된다.
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	

}
