package gamelevel;

public class SuperLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("엄청 빨리 달린다");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump");
	}

	@Override
	public void turn() {
		System.out.println("빠르게 turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****상급자입니다*****");
	}

}
