package interfaceEx;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.buy();
		customer.sell();
		
		customer.order(); //customer�� order
		buyer.order();	//customer�� order(�ν��Ͻ��� method ȣ��)
		seller.order();	//customer�� order(�ν��Ͻ��� method ȣ��)
	}
}
