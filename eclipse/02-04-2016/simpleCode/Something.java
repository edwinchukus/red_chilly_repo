package simpleCode;

public class Something {
	
	
	
	public double divideNumber(int x, int y) {
		int ans = 0;
		try {
			ans = x / y;
		}catch(Throwable t) {
			System.out.println(t.getMessage());	
		}finally {
			System.out.println("Finally has been executed!!!");
		}
		return ans;
	}

}
