package staticEx;

public class Student {

	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	/*
	  �������� �ν��Ͻ��� ���� �޸��� ���� �����ؾ��ϴ°�� static������ ����Ѵ�.
	  static�� heap(����)�޸𸮰� �ƴ� ���α׷��� load�ɶ� �޸�(������ ����)�� �ο��ȴ�(����� �̿Ͱ���)
	  ���������� ���ø޸𸮸� ����ϰ�, �ν��Ͻ��� �����ɶ����� ����ϴ� �����޸� heap�޸𸮸� ����Ѵ�.
	 */
	
	public static int getSerialNum() {
		int i = 10; //�������� -> �޼��尡 ȣ��ɶ� �����Ǽ� ������ �������.
		
		/*
		 studentID = 10; //�ν��Ͻ� ���� -> �ν��Ͻ��� ����(new)�ɶ� ������ �ȴ�. �׷��⶧���� static method���� ����� �Ұ�
		 static method�� �ν��Ͻ��� ������ ���� ���� Ŭ���� �̸����� ���� �޼��带 ȣ���Ѵ�.
		*/
		
		return serialNum; //static ����(class����)
	}
}
