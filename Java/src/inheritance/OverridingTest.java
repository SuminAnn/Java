package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(100010, "LEE");
		customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
		customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(100010, "Who", 200);
		customerWho.calcPrice(10000);
		System.out.println(customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		customerGold.calcPrice(10000);
		System.out.println(customerGold.showCustomerInfo());
		
		/*
		 ���� �޼��� : ��ü�� ������ �޼����� ������ �� Ÿ�ӿ� ���� �̷������.
		 			���� �޼����� ���� Ÿ�԰� ������� ���� ������ �ν��Ͻ��� �޼��尡 ȣ��ȴ�.
		 			�޼��尡 �����ǵ� ��� �����ǵ� �޼����� �ּҸ� ����Ų��.
		 */
	}
}
