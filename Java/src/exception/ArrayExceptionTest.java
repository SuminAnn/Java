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
		System.out.println("end"); // ����ó���� ���� �ʴ°�� �ý����� �ٿ�Ǽ� end�� ������� ���Ѵ�
	}
}
