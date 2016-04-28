package com.bedding;

import java.util.Scanner;

public class DecisionMaker {
	
	private String condition;
	private Scanner scan;
	
	public DecisionMaker(String condition) {
		scan = new Scanner(System.in);
		this.condition = condition;
	}

	public DecisionMaker() {
		scan = new Scanner(System.in);
	}
	
	
	public double takeFirstInput() {
		System.out.println("Enter first Number: ");
		double a = scan.nextDouble();
		return a;
	}

	
	public double takeSecondInput() {
		System.out.println("Enter Second Number: ");
		double b = scan.nextDouble();
		return b;
	}
	
	public String takeOperatorInput() {
		System.out.println("Enter Operator: ");
		String o = scan.next();
		return o;
	}
	
	
	
}
