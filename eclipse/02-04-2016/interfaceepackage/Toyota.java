package interfaceepackage;

public class Toyota implements UKMan{

	@Override
	public void drive() {
		System.out.println("Yes we are Toyota");
		System.out.println("All our cars can move");
	}

	@Override
	public int showNumberOfTyres() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String showRegistrationNumber() {
		String engineNumber = "EN210TC";
		String regNumber = engineNumber + " "+ "Toyota" ;
		return regNumber;
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
