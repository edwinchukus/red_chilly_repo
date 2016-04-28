package allArraysStuffs;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayClass {
	
	
	public void showHashable() {
		Hashtable<String, String> solarSystem = new Hashtable<String, String>();
		
		solarSystem.put("One", "Mercury");
		solarSystem.put("Two", "Venus");
		solarSystem.put("Three", "Earth");
		solarSystem.put("Four", "Uranus");
		
		System.out.println(solarSystem.get("Four"));

		boolean  answer1 = solarSystem.containsValue("Earth");
		System.out.println(answer1);
		boolean answer = solarSystem.containsKey("One");
		System.out.println(answer);
		System.out.println(solarSystem.get("Four"));
	}
	
	
	
	
	
	
	public void showArrayList() {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Edwin Nwofor");
		names.add("Kennth O");
		names.add("John Smith");
		names.add("Naji N");
		names.add("Lola Nwofor");
		names.add("Edwin Niyi");
		names.add("Huxley Nwofor");
		names.add("Seyi Niyi");
		names.add("Edwin Nwofor");
		names.add("Kennth O");
		names.add("John Smith");
		names.add("Naji N");
		names.add("Lola Nwofor");
		names.add("Edwin Niyi");
		names.add("Huxley Nwofor");
		names.add("Seyi Niyi");
		names.add("Edwin Nwofor");
		names.add("Kennth O");
		names.add("John Smith");
		names.add("Naji N");
		names.add("Lola Nwofor");
		names.add("Edwin Niyi");
		names.add("Huxley Nwofor");
		names.add("Seyi Niyi");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("#########################");

		
		names.set(5, "Dan North");
		for(String name : names) {
		System.out.println(name);
	}	
		
	}
	
	
	
	public void show2DimesionalArray() {
		int a[][] = new int[3][2];
		a[0][0] = 5;
		a[0][1] = 7;
		a[1][0] = 15;
		a[1][1] = 58;
		a[2][0] = 51;
		a[2][1] = 2;
		
		for(int i = 0; i < a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j] == 55) {
					System.out.println("Well, I have found the actual and clicked on it");
					break;
				}
			}
		}
		
	}
	
	public void showArray() {
		
		String names [] = new String[14];
		
		names[0] = "Stella";
		names[1] = "Lola";
		names[2] = "Niyi";
		names[3] = "Nduka";
		names[4] = "Naji";
		names[5] = "Seyi";
		names[6] = "John";
		names[7] = "Kenneth";
		names[8] = "Edwin";
		names[9] = "Huxely";
		names[10] = "Sheriff";
		
//		for(String name : names) {
//			if(name.equalsIgnoreCase("")) {
//				System.out.println(name);
////				break;
//			}
//		}
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[10]);
//		for(int x = 1; x < names.length; x++) {
//			System.out.println(names[x]);
//		}
		
		
	}

}
