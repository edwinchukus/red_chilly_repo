package plan.something;

public class Candidate {
	
	
	private String candidateName;
	private long candidateMobileNumber;
	private int registrationNumber;
	
	
	public Candidate(String candidateName, long candidateMobileNumber, int registrationNumber) {
		this.candidateName = candidateName;
		this.candidateMobileNumber = candidateMobileNumber;
		this.registrationNumber = registrationNumber;
	}
	
	
	public void CheckAttendance() {
		if(registrationNumber > 0 && registrationNumber <= 10) {
			if(candidateName.toLowerCase().contains("charles")) {
				System.out.println("I am the chairman of the occasion and his number is "+ candidateMobileNumber);
			}else {
				System.out.println("This is the chariman's wife");
			}
		}else if(registrationNumber >= 11 && registrationNumber <= 20 ) {
			if(candidateName.toLowerCase().contains("paul")) {
				System.out.println("This is Edwin and his number is "+ candidateMobileNumber);
			}else {
				System.out.println("This is Edwin's wife");
			}	
		}	
	}

}
