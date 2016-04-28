package animalPackage;

public class Animal {
	
	
	
	private String animalName;

	public Animal(String animalName) {
		this.animalName = animalName;
	}

	public void walk() {
		System.out.println(" I am "+animalName+ " and I can walk ...");		
	}

	public String jump() {
		String message = "I am "+ animalName+ " and I can jump";
		return message;
	}

	public String run(String distance) {
		String message = "I am "+ animalName+ " and I can run for "+distance +" meters";
		return message;		
	}
	
	
	
	

}
