package interfaceEx;

public interface Calc {
	/*
	 interface에서는 상수와 추상메서드가 선언이된다
	  - 변수에 따로 선언하지 않아도 public static final이다
	  - 메서드에 따로 선언하지 않아도 public abstract이다
	  - 클래스 상속과 달리 구현코드가 없기 때문에 타입만 상속받기 때문에 ,를 통해 여러개를 구현할 수 있다
	  - 형 변환시 사용할 수 있는 메서드는 interface에 선언된 메서드만 사용할 수 있다
	  - interface implements는 타입상속이고, class extends는 구현상속이다
	 */
	double PI = 3.14;
	int ERROR = -999999999;

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	} //하위클래스에서 재정의가 가능하다.
	
	static int total(int[] arr) {
		int tot = 0;
		
		for(int i : arr) {
			tot += i;
		}
		
		return tot;
	}
	
	
}
