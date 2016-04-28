package animalPackage;

import java.util.Scanner;

public class GeorgeOwellFarm {

	public static void main(String[] args) {
		
		Iniliaser ini = new Iniliaser();
		String animalName = ini.getAnimalName();
		String action = ini.getAction();
		Animal animal = ini.getAnimal();
		Scanner scanner = ini.getScanner();		
		DecisionMaker dm = new DecisionMaker(animalName, action, animal, scanner);
		dm.decide();
		
		System.out.println();
	}

}
