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
		
		customer.order(); //customer의 order
		buyer.order();	//customer의 order(인스턴스의 method 호출)
		seller.order();	//customer의 order(인스턴스의 method 호출)
	}
}
