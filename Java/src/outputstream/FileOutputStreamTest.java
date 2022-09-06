package outputstream;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
//		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // �Ű躯���� true�� �ָ� ����Ⱑ �ƴ� �̾ ���Ⱑ �����ϴ�
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
//			fos.write(68);
//		}catch(IOException e) {
//			System.out.println(e);
//		}
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // �Ű躯���� true�� �ָ� ����Ⱑ �ƴ� �̾ ���Ⱑ �����ϴ�
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
