package inheritance;

public class Circle { // point와 circle의 경우는 상속관계가 아닌 합성(참조변수를 가져와서 활용하는)관계이다.

//	private int x;
//	private int y;
	
	Point point;
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
	
}
