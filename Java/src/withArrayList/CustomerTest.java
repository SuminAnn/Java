package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		for(Customer customer : customerList) {
			customer.calcPrice(price);
			System.out.println(customer.showCustomerInfo());
		}
	}
}
