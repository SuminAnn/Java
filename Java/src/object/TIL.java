package object;

public class TIL {

	/*
	 Object
	  - 모든 클래스의 최상위 클래스
	  - 모든 클래스는 Object 클래스의 메서드를 사용할 수 있다
	  - 모든 클래스는 Object 클래스에서 상속받는다
	  - 모든 클래스는 Object 클래스의 메서드 중 일부는 재정의 할 수 있다(final로 선언된 메서드는 재정의 할 수 없다)
	  
	 toString()메서드
	  - 객체의 정보를 String으로 바꾸어서 사용할 때 쓰인다
	  - String 이나 Integer클래스에는 이미 재정의 되어 있다
	  
	 equals()메서드
	  - 두 인스턴스의 주소 값을 비교하는 메서드
	  - String, Integer는 재정의가 되어있다(같은 문자열인 경우, 같은 정수값인 경우 true를 반환)
	  
	 hashCode()메서드
	  - hash : 정보를 저장, 검색하기 위해 사용하는 자료구조
	  - 인스턴스가 저장된 주소값을 반환해준다
	  - 힙 메모리에 인스턴스가 저장되는 방식이 hash이다
	  - 자바 가상 머신의 저장한 인스턴스의 주소값을 10진수로 나타낸다
	  - 재정의 된 equals() 메서드의 값이 true, 동일한 hashCode() 반환 값을 가져야 한다
	  - 논리적으로 동일함을 위해 equals()메서드를 재정의 하였다면 hashCode() 메서드로 재정의 하여 동일한 값이 반환 되도록 한다
	  - String 클래스 : 동일한 문자열 인스턴스에 대해 동일한 정수가 반환된다
	  - Integer 클래스 : 동일한 정수값의 인스턴스에 대해 같은 정수값이 반환된다
	  - 논리적으로 같으면 hashCode값도 동일하다
	  
	 clone()메서드
	  - 객체의 원본 복제하는데 사용한다
	  - 원본을 유지해 놓고 복사본을 사용할 떄
	  - 기본 틀을 두고 복잡한 생성과정을 반복하지 않고 복제
	  - clone() 메서드를 사용하면 객체의 정보(멤버변수 값)가 같은 인스턴스가 또 생성되는 것이므로 객체 지향 프로그램의 정보은닉, 객체 보호의 관점에서
	    위배될 수 있다
	  - 객체의 clone() 메서드 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해준다
	  
	  
	 */
}
