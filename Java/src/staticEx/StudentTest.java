package staticEx;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		System.out.println(Student.serialNum); //static변수를 사용하는 경우에는 Class이름으로 참조한다.
	}
}
