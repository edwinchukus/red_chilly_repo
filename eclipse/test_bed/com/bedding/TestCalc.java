package com.bedding;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		DecisionMaker dm = new DecisionMaker();
		double a = dm.takeFirstInput();
		
		String operator = dm.takeOperatorInput();
		
		double b = dm.takeSecondInput();
		
		Compute compute = new Compute(operator, a, b);
		
		double answer = compute.computeResult();
		System.out.println("The Answer is: "+answer);
	}

}
