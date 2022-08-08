package interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
//		Calc calc1 = new calc();		// interface는 new 할 수 없다
//		Calc calc2 = new Calculator();  // 추상class는 new 할 수 없다.
		CompleteCalc calc3 = new CompleteCalc();
		
		calc.add(num1, num2);
//		calc.showInfo();	// Calc타입이기 때문에 보이지 않는다
		calc3.add(num1, num2);
		calc3.showInfo();
		calc3.description(); //default method(기본적인 구현코드가 제공)
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr); //static method(인스턴스가 생성과 상관없이 interface 이름만으로 호출)
		System.out.println(sum);
	}
}
