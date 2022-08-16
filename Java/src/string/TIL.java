package string;

public class TIL {

	/*
	 String
	  - String str1 = new String("abc"); 생성자의 매개변수로 문자열을 생성 -> 힙 메모리에 생성
	  - String str2 = "test"; 문자열 상수를 가르키는 방식 -> 상수 풀에 생성 -> 상수 풀의 문자열을 참조하면 모든 문자열이 같은 주소를 가르킨다
	  - 한번 생성된 String값은 불변
	  - 두개의 문자열을 연결하면 새로운 인스턴스가 생성 된다
	  - 문자열 연결을 계속하면 메모리에 gabage가 많이 생길 수 있다 -> StringBuilder or StringBuffer를 사용한다
	  
	 StringBuilder, StringBuffer
	  - 내부적으로 가변적인 char[]배열을 가지고 있는 클래스
	  - 문자열을 여러 번 연결하거나 변경할 때 사용하면 유용하다
	  - 매번 새로 생성하지 않고 기존 배열을 변경하므로 gabage가 생기지 않는다
	  - StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다
	  - 단일 쓰레드 프로그램에서는 StringBuilder를 사용하기를 권장
	  - toString() 메서드로 String 반환
	  
	 Wrapper 클래스
	  - 기본 자료형에 대한 클래스
	  - Integer는 객체이고, int는 4바이트 기본 자료형이다
	  - 두 개의 자료를 같이 연산할 때 자동으로 변환이 일어난다
	  
	 Class 클래스
	  - 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성된다
	  - class 파일에는 객체의 정보(멤버변수, 메서드, 생성자 등)가 포함되어 있다
	  - Class 클래스는 컴파일 된 class 파일에서 객체의 정보를 가져올 수 있다
	 */
}
