package staticEx;

public class Student {

	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	/*
	  복수개의 인스턴스가 같은 메모리의 값을 공유해야하는경우 static변수를 사용한다.
	  static은 heap(동적)메모리가 아닌 프로그램이 load될때 메모리(데이터 영역)가 부여된다(상수도 이와같다)
	  지역변수는 스택메모리를 사용하고, 인스턴스가 생성될때마다 사용하는 동적메모리 heap메모리를 사용한다.
	 */
	
	public static int getSerialNum() {
		int i = 10; //지역변수 -> 메서드가 호출될때 생성되서 끝나면 사라진다.
		
		/*
		 studentID = 10; //인스턴스 변수 -> 인스턴스가 생성(new)될때 생성이 된다. 그렇기때문에 static method에서 사용이 불가
		 static method는 인스턴스의 생성과 관계 없이 클래스 이름으로 직접 메서드를 호출한다.
		*/
		
		return serialNum; //static 변수(class변수)
	}
}
