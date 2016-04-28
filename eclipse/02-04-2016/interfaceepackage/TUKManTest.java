package interfaceepackage;

public class TUKManTest {
	
	private static UKMan ukMan; 

	public static void main(String[] args) {
		
		ukMan = new Honda();
		String regNum = ukMan.showRegistrationNumber();
		System.out.println(regNum);
		
		ukMan = new Toyota();
		String regNum1 = ukMan.showRegistrationNumber();
		System.out.println(regNum1);
		
	}

}
