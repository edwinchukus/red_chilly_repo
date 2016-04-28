package foodstore;

public class Food extends Tesco{

	public Food(String storeName) {
		super(storeName);
	}

	
	public void showStoreName() {
		System.out.println(storeName);
	}
	
	
	public String goToPage() {
		System.out.println("Hi");
		return "Hello World" + storeName;
	}
}
