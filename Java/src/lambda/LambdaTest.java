package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test"); //변수에 대입하는 방식
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	} // 매개변수로 넘어가는 방식
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world");
	} // return값으로 넘기는 방식
}
