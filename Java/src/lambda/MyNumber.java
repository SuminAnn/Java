package lambda;

@FunctionalInterface
public interface MyNumber {

	int getMaxNumber(int num1, int num2);
	//int testNumber(); //함수형 인터페이스같은 경우 메소드를 하나만 선언(구현시 어떤 메소드인지 알 수 없기때문)
}
