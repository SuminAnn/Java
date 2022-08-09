package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
	
	/*
	 equals 재정의하고 hashCode 재정의하지 않는 경우 collection에서 hashSet을 사용하는 경우 올바르게 동작하지 않을 수도 있다
	 */
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true
		
		Student std1 = new Student(1001, "Tom");
		Student std2 = new Student(1001, "Tom");
		
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //false 재정의 후에는 true
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode()); // 주소값이 다르다
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 주소값이 일치한다
	}
}
