package singleton;

public class Company {

	private static Company insatance = new Company(); //���ο��� �� �Ѱ��� ����
	
	private Company(){ //�ܺο��� �����ڸ� ȣ������ ���ϰ�(private)
		
	}
	
	public static Company getInstance() { //static method�� �����ϸ� ��ü�� �������� �ʰ� method ȣ���� �����ϴ�.
		return insatance;
	}
	
	/*
	 singleton ���� : �� �ϳ��� �ν��Ͻ����� �����ϵ��� �����ϴ� ���
	  - static ������ ����Ѵ�.
	  - �����ڸ� private�� �����.
	  - public���� ����� static �޼��带 �����Ѵ�.
	 */
}
