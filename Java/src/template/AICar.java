package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행한다");
		System.out.println("자동차가 스스로 방향을 전환한다");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춘다");
	}

}
