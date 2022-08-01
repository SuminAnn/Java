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
		 가상 메서드 : 객체의 변수나 메서드의 참조는 그 타임에 따라 이루어진다.
		 			가상 메서드의 경우는 타입과 상관없이 실제 생성된 인스턴스의 메서드가 호출된다.
		 			메서드가 재정의된 경우 재정의된 메서드의 주소를 가르킨다.
		 */
	}
}
