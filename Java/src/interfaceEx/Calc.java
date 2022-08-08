package interfaceEx;

public interface Calc {
	/*
	 interface������ ����� �߻�޼��尡 �����̵ȴ�
	  - ������ ���� �������� �ʾƵ� public static final�̴�
	  - �޼��忡 ���� �������� �ʾƵ� public abstract�̴�
	  - Ŭ���� ��Ӱ� �޸� �����ڵ尡 ���� ������ Ÿ�Ը� ��ӹޱ� ������ ,�� ���� �������� ������ �� �ִ�
	  - �� ��ȯ�� ����� �� �ִ� �޼���� interface�� ����� �޼��常 ����� �� �ִ�
	  - interface implements�� Ÿ�Ի���̰�, class extends�� ��������̴�
	 */
	double PI = 3.14;
	int ERROR = -999999999;

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	} //����Ŭ�������� �����ǰ� �����ϴ�.
	
	static int total(int[] arr) {
		int tot = 0;
		
		for(int i : arr) {
			tot += i;
		}
		
		return tot;
	}
	
	
}
