package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
//		int cnt = (int)stream.count();
//		System.out.println(cnt); // 한번 생성된 stream은 재사용할 수 없다
	}
}
