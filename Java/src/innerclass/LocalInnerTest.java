package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable =  new Runnable(){
		
		final int localNum = 300;

			@Override
			public void run() {
				
//				localNum += 100; method�� ���������� inner class���� ������ �Ұ��ϴ�
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		}; // �͸� inner class
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.runnable.run();
	}
}
