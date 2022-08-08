package interfaceEx;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	} //default method가 중복되는경우 재정의해서 사용한다

}
