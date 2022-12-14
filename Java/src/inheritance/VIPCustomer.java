package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		super(); // 기본생성자를 생성하지 않은 상태에서 다른 생성자만 생성하는 경우 하위 클래스 생성장에서 오류가 발생한다. -> 상위 기본 생성자를 호출하기 떄문에
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "VIP";
		bonusRatio = 0.02;
		this.agentID = agentID;
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	
}
