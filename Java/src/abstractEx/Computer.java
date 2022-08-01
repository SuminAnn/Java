package abstractEx;

public abstract class Computer {

	/*
	 추상 클래스 : 추상 메서드를 포함한 클래스
	 			abstract 예약어를 사용한다.
	 			추상 클래스는 new(인스턴스 화) 할 수 없다.
	 			추상 메서드는 구현코드 없이 메서드의 선언만 있다. ex) abstract int add(int x, int y);
	 			하위 클래스에서 구현을 한다.
	 */
	
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	} // 추상 메서드가 아닌 메서드도 사용할 수 있다.
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
