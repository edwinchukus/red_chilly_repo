package overriding;

public class Tobby extends Bukky{

	
	public void makeCall() {
		super.makeCall();
		String calling = 44 + mobileNumber;
		System.out.println("Calling ... " + calling);
	}
	
	
	
}
