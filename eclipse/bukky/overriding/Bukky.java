package overriding;

public class Bukky {
	
	protected String mobileNumber;
	
	public void makeCall() {
		String calling = 234 + mobileNumber;
		System.out.println("Calling ... " + calling);
	}
	

}
