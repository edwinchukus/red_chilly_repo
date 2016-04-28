package interface_concept;

public class TestCar {

	public static void main(String[] args) {
		Toyota camry = new Toyota();
		long toyotaEngineNum = camry.displayEngineNumber();
		System.out.println(toyotaEngineNum);
		
		Ford f14 = new Ford();
		long fordEngineNum = f14.displayEngineNumber();
		System.out.println(fordEngineNum);
		
		Car f15 = new Ford();
		Car f16 = new Toyota();
		Car f17 = new Honda();
//		
//		WebDriver driver1 = new FirefoxDriver();
//		WebDriver driver2 = new ChromeDriver();
		
		

	}

}
