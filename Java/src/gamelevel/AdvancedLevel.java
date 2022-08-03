package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달린다");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 수 없다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****중급자입니다*****");
	}

}
