package scheduler;

public interface Scheduler {
	/*
	 추상 메서드 : 모든 메서드는 추상 메서드로 구현
	 디폴트 메서드 : 기본 구현을 가지는 메서드, 구현 클래스에서 재정의 할 수 있다
	 정적 메서드(static) : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드
	 private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없다. 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
	 */

	void getNextCall();
	void sendCallToAgent();
	
	
}
