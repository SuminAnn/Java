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
		//static int sInNum = 100; ���� Ŭ���������� static������ ������ �� ����
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
//		static void sTest() {
//			
//		} ����Ŭ���������� static �޼��带 ����� �� ����
	} // �ν��Ͻ� inner class
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; outClass�� instance������ ��� �Ұ��ϴ�
			sNum += 10; //static ������ ��� �����ϴ�
		}
		
	} // static inner class (out class�� ������ ������� ��� ����)
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInTest();
	}
}
