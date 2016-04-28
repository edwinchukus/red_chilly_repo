package poly_package;

public class Calculation {
	
	
	
	
	public int add() {
		int i = 2;
		int j = 6;
		int result = i + j;
		System.out.println("answer derived from addition without parameters");
		return result;
	}
	
	
	public int add(int i, int j) {
		int result = i + j;
		System.out.println("answer derived from addition with int parameters");
		return result;
	}	

	
	public double add(double i, double j) {
		double result = i + j;
		System.out.println("answer derived from addition with double parameters");
		return result;
	}
	
	
	public double add(int i, double j) {
		double result = i + j;
		System.out.println("answer derived from addition with int and double parameters");
		return result;
	}
}
