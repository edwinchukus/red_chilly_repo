package animalPackage;

import java.util.Scanner;

public class DecisionMaker {
	
	private String animalName;
	private String action;
	private Animal animal;
	private Scanner scanner;



	public DecisionMaker(String animalName, String action, Animal animal, Scanner scanner) {
		this.animalName = animalName;
		this.action = action;
		this.animal = animal;
		this.scanner = scanner;
	}
	
	
	
	public void decide() {
		
		if(animalName.toLowerCase().equals("cattle")) {
			if(action.toLowerCase().equals("walk")) {
				animal.walk();
			}else if(action.toLowerCase().equals("jump")) {
				String answer = animal.jump();
				System.out.println(answer);
			}else if(action.toLowerCase().equals("run")) {
				System.out.println("How many meters should it run?");
				String distance = scanner.nextLine();
				String answer = animal.run(distance);
				System.out.println(answer);
			}
		}else if(animalName.toLowerCase().equals("goat")) {
			if(action.toLowerCase().equals("walk")) {
				animal.walk();
			}else if(action.toLowerCase().equals("jump")) {
				String answer = animal.jump();
				System.out.println(answer);
			}else if(action.toLowerCase().equals("run")) {
				System.out.println("How many meters should it run?");
				String distance = scanner.nextLine();
				String answer = animal.run(distance);
				System.out.println(answer);
			}
		}else if(animalName.toLowerCase().equals("sheep")) {
			if(action.toLowerCase().equals("walk")) {
				animal.walk();
			}else if(action.toLowerCase().equals("jump")) {
				String answer = animal.jump();
				System.out.println(answer);
			}else if(action.toLowerCase().equals("run")) {
				System.out.println("How many meters should it run?");
				String distance = scanner.nextLine();
				String answer = animal.run(distance);
				System.out.println(answer);
			}
		}else {
			System.out.println("Sorry we don't have such animal in our farm");
		}
		
	}

}
