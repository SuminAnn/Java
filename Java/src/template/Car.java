package template;

public abstract class Car {
	/*
	 템플릿 메서드 : 추상 메서드나 구현된 메서드를 활용하여 전체 기능의 흐름을 정의하는 메서드
	 			 final로 선언하면 하위 클래스에서 재정의 할 수 없다.
	  - 프레임 워크에서 많이 사용되는 설계 패턴
	  - 추상 클래스로 선언된 상위 클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고
	    하위 클래스에서 다르게 구현되어야하는 부분은 추상 메서드로 선언해서 하위 클래스가 구현하도록 한다.
	    
	 final 예약어
	  - final 변수는 값이 변경될 수 없는 상수
	  - final 변수는 오직 한번만 값을 할 당할 수 있다
	  - final method는 하위 클래스에서 쟁정의(overriding) 할 수 없다
	  - final class는 더 이상 상속되지 않는다
	 */
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켠다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끈다");
	}
	
	public final void run() { //final 선언시 하위 클래스에서 재정의가 불가하다(시나리오가 바뀌지 않는 경우 final을 선언한다) -> template method
		startCar();
		drive();
		stop();
		turnOff();
	}

}
