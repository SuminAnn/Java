package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable =  new Runnable(){
		
		final int localNum = 300;

			@Override
			public void run() {
				
//				localNum += 100; method의 지역변수는 inner class에서 변경이 불가하다
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		}; // 익명 inner class
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.runnable.run();
	}
}
