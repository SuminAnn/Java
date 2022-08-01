package inheritance;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이는 네발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리는 날개로 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘을 날아갑니다.");
	}
}

public class AnimalTest {
	/*
	  다형성 : 하나의 코드가 여러가지 자료형으로 구현되어 실행되는 것
	  		 하나의 클래스를 상속 받은 여러 클래스가 있는 경우 각 클래스마다 같은 이름의 서로 다른 메서드를 재정의 한다.
	  		 상위 클래스 타입으로 선언된 하나의 변수가 여러 인스턴스에 대입되어 다양한 구현이 실행 될 수 있다.
	 */
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if( animal instanceof Human) { //다운캐스팅 -> 상속관계에서 overriding으로 해결이 가능하면 overriding으로 해결하는게 좋다.
			Human human = (Human)animal;
			human.readBook();
		}
	}
}
