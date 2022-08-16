package string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 두 주소값이 다르다
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 두 주소값은 같다
	}
}
