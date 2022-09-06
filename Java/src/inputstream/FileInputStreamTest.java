package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		int i = 0 ;
		try {
			fis = new FileInputStream("input.txt"); // ����Ʈ�� �б� ������ �ѱ��� ������ -> FileReader�� ����ؾ��Ѵ�
			while( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
