package interfaceEx;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
//		Calc calc1 = new calc();		// interface�� new �� �� ����
//		Calc calc2 = new Calculator();  // �߻�class�� new �� �� ����.
		CompleteCalc calc3 = new CompleteCalc();
		
		calc.add(num1, num2);
//		calc.showInfo();	// CalcŸ���̱� ������ ������ �ʴ´�
		calc3.add(num1, num2);
		calc3.showInfo();
	}
}
