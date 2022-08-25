package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 200;
		//static int sInNum = 100; 내부 클래스에서는 static변수를 선언할 수 없다
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
//		static void sTest() {
//			
//		} 내부클래스에서는 static 메서드를 사용할 수 없다
	} // 인스턴스 inner class
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; outClass의 instance변수는 사용 불가하다
			sNum += 10; //static 변수는 사용 가능하다
		}
		
	} // static inner class (out class의 생성과 상관없이 사용 가능)
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInTest();
	}
}
