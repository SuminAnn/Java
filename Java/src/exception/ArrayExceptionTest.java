package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			} // runtime exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("end"); // 예외처리를 하지 않는경우 시스템이 다운되서 end를 출력하지 못한다
	}
}
