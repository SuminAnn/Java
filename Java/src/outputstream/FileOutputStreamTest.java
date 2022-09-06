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
		
//		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // 매계변수로 true를 주면 덮어쓰기가 아닌 이어서 쓰기가 가능하다
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
//			fos.write(68);
//		}catch(IOException e) {
//			System.out.println(e);
//		}
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){ // 매계변수로 true를 주면 덮어쓰기가 아닌 이어서 쓰기가 가능하다
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
