package abstractEx;

public abstract class Computer {

	/*
	 �߻� Ŭ���� : �߻� �޼��带 ������ Ŭ����
	 			abstract ���� ����Ѵ�.
	 			�߻� Ŭ������ new(�ν��Ͻ� ȭ) �� �� ����.
	 			�߻� �޼���� �����ڵ� ���� �޼����� ���� �ִ�. ex) abstract int add(int x, int y);
	 			���� Ŭ�������� ������ �Ѵ�.
	 */
	
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("������ �մϴ�");
	} // �߻� �޼��尡 �ƴ� �޼��嵵 ����� �� �ִ�.
	
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
}
