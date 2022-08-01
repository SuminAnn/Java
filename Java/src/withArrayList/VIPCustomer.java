package withArrayList;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		super(); // �⺻�����ڸ� �������� ���� ���¿��� �ٸ� �����ڸ� �����ϴ� ��� ���� Ŭ���� �����忡�� ������ �߻��Ѵ�. -> ���� �⺻ �����ڸ� ȣ���ϱ� ������
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}
	
	

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�";
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	
}
