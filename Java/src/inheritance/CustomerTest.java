package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		
		Customer customerAn = new VIPCustomer(); // ��ĳ���� -> ���� Ŭ������ ������ method�� ���ü��� ����.
		customerKim.setCustomerID(10102);
		customerKim.setCustomerName("An");
		
		
	}
}
