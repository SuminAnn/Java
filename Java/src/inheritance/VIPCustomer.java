package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		super(); // �⺻�����ڸ� �������� ���� ���¿��� �ٸ� �����ڸ� �����ϴ� ��� ���� Ŭ���� �����忡�� ������ �߻��Ѵ�. -> ���� �⺻ �����ڸ� ȣ���ϱ� ������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public VIPCustomer(int customerID, String customerName) {
//		this.customerID = customerID;
//		this.customerName = customerName;
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//	}
	
}
