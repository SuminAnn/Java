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
		calc3.description(); //default method(�⺻���� �����ڵ尡 ����)
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr); //static method(�ν��Ͻ��� ������ ������� interface �̸������� ȣ��)
		System.out.println(sum);
	}
}
