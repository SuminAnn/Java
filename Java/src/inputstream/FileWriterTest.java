package inputstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("wirter.txt")){
			fw.write("A");
			char[] cbuf = {'B', 'C', 'D'};
			fw.write(cbuf);
			fw.write("æ»≥Á«œººø‰");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
