package inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 입력해주세요");
		int i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println((char)i);
	}
}
