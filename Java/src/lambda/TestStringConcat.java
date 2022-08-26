package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "Java"); //객체지향 방법(계속 지속적으로 사용하는 경우)
		
		
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "Java"); // 람다식(단일, 일시적으로 사용하는 경우)
		
	}
}
