package animalPackage;

import java.util.Scanner;

public class Iniliaser {
	
	private Scanner scanner;
	private String animalName;
	private Animal animal;
	
	public Iniliaser() {
		this.scanner = new Scanner(System.in);
	}
	
	
	public String getAnimalName() {		
		System.out.println("Welcome to George O'Well Animal Farm ");
		System.out.println("Please select from any of the following animal to inspect: Cattle, Goat and Sheep");
		this.animalName = scanner.nextLine();
		return animalName;
	}
	
	
	public Scanner getScanner() {
		return scanner;
	}
	
	public Animal getAnimal() {
		this.animal = new Animal(animalName);
		return animal;
		
	}
	
	public String getAction() {
		System.out.println("Thank you for choosing to see "+animalName );
		System.out.println("Select what you would like the " +animalName+" to do: walk, jump and run");
		String action = scanner.nextLine();
		return action;
	}

}
