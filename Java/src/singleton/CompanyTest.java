package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//Company company3 = new Company(); //error
		System.out.println(company1 == company2); //true
	}
}
