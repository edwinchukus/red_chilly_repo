package poly_package;

public class Casio {
	
	
	private String calName;
	private int calcNumer;

	

	public Casio() {
		
	}
	
	public Casio(String calName) {
		this.calName = calName;
	}
	
	public Casio(int calcNumer, String calName) {
		this.calcNumer = calcNumer;
		this.calName = calName;
	}

	
	
	public String getCalName() {
		return calName;
	}

	public void setCalName(String calName) {
		this.calName = calName;
	}

	public int getCalcNumer() {
		return calcNumer;
	}

	public void setCalcNumer(int calcNumer) {
		this.calcNumer = calcNumer;
	}
	
	
}
