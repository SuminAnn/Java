package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����Ѵ�");
		System.out.println("�ڵ����� ������ ������ ��ȯ�Ѵ�");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ������ �����");
	}

}
