package buyer;

import java.util.Scanner;

public class RunTest {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter animal name");
		String animalName1 = scanner.nextLine();
		
		System.out.println("Enter animal name");
		String animalName2 = scanner.nextLine();
		
		System.out.println("Enter animal name");
		String animalName3 = scanner.nextLine();
		
		AnimalClass goat = new AnimalClass(animalName1,animalName2, animalName3);
		goat.showvalues();
//		goat.jump();
		
	}
//		AnimalClass sheep = new AnimalClass("sheep");
//		sheep.run();
//		sheep.jump();
//		sheep.talk();
//		
//		AnimalClass cattle = new AnimalClass("cattle");
//		cattle.talk();
//		cattle.jump();
//		cattle.walk();
//		cattle.run();
//			
	}	
		
	
		