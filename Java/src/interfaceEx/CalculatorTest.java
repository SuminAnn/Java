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
	}
}
