package interface_concept;

public class Toyota implements Car{

	@Override
	public void drive() {
		
		
	}

	@Override
	public String showCarName() {
		
		return null;
	}

	@Override
	public long displayEngineNumber() {
		int chaseNumber = 85245;
		int registrationNumber = 2016;
		long num =chaseNumber + registrationNumber;
		return num;
	}

	@Override
	public int move() {
		return 0;
		
	}

	@Override
	public int checkCarAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
