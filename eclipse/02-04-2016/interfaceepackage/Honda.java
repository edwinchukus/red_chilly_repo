package interfaceepackage;

public class Honda implements UKMan{

	@Override
	public void drive() {
		System.out.println("Yes My can move");
	}

	@Override
	public int showNumberOfTyres() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String showRegistrationNumber() {		
		return "Honda 12504";
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void showCarVolume() {
		
	}

}
