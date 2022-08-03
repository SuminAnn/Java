package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달린다");
	}

	@Override
	public void jump() {
		System.out.println("jump 할 수 없다");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 수 없다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자입니다*****");
	}

}
