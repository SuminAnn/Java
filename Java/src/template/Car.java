package template;

public abstract class Car {
	/*
	 ���ø� �޼��� : �߻� �޼��峪 ������ �޼��带 Ȱ���Ͽ� ��ü ����� �帧�� �����ϴ� �޼���
	 			 final�� �����ϸ� ���� Ŭ�������� ������ �� �� ����.
	  - ������ ��ũ���� ���� ���Ǵ� ���� ����
	  - �߻� Ŭ������ ����� ���� Ŭ������ ���ø� �޼��带 Ȱ���Ͽ� ��ü���� �帧�� �����ϰ�
	    ���� Ŭ�������� �ٸ��� �����Ǿ���ϴ� �κ��� �߻� �޼���� �����ؼ� ���� Ŭ������ �����ϵ��� �Ѵ�.
	    
	 final �����
	  - final ������ ���� ����� �� ���� ���
	  - final ������ ���� �ѹ��� ���� �� ���� �� �ִ�
	  - final method�� ���� Ŭ�������� ������(overriding) �� �� ����
	  - final class�� �� �̻� ��ӵ��� �ʴ´�
	 */
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �Ҵ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ����");
	}
	
	public final void run() { //final ����� ���� Ŭ�������� �����ǰ� �Ұ��ϴ�(�ó������� �ٲ��� �ʴ� ��� final�� �����Ѵ�) -> template method
		startCar();
		drive();
		stop();
		turnOff();
	}

}
