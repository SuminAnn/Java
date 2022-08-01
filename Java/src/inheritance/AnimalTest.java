package inheritance;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� ������ ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	/*
	  ������ : �ϳ��� �ڵ尡 �������� �ڷ������� �����Ǿ� ����Ǵ� ��
	  		 �ϳ��� Ŭ������ ��� ���� ���� Ŭ������ �ִ� ��� �� Ŭ�������� ���� �̸��� ���� �ٸ� �޼��带 ������ �Ѵ�.
	  		 ���� Ŭ���� Ÿ������ ����� �ϳ��� ������ ���� �ν��Ͻ��� ���ԵǾ� �پ��� ������ ���� �� �� �ִ�.
	 */
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if( animal instanceof Human) { //�ٿ�ĳ���� -> ��Ӱ��迡�� overriding���� �ذ��� �����ϸ� overriding���� �ذ��ϴ°� ����.
			Human human = (Human)animal;
			human.readBook();
		}
	}
}
