package singleton;

public class Company {

	private static Company insatance = new Company(); //내부에서 단 한개만 선언
	
	private Company(){ //외부에서 생성자를 호출하지 못하게(private)
		
	}
	
	public static Company getInstance() { //static method를 생성하면 객체를 생성하지 않고 method 호출이 가능하다.
		return insatance;
	}
	
	/*
	 singleton 패턴 : 단 하나의 인스턴스만이 존재하도록 구현하는 방식
	  - static 변수를 사용한다.
	  - 생성자를 private로 만든다.
	  - public으로 선언된 static 메서드를 제공한다.
	 */
}
