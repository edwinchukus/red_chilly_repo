package com.bedding;

public class Calculator {
	
	private double a;
	private double b;

	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double divide(double a, double b2) {
		double answer = a / b;
		return answer;
	}


	public double findReminder(double a2, double b2) {
		double answer = a % b;
		return answer;
	}


	public double multiply(double a2, double b2) {
		double answer = a * b;
		return answer;
	}


	public double processError(double a2, double b2) {
		System.out.println("No such operator");
		return 0;
	}


	public double add(double a, double b) {
		double answer = a + b;
		return answer;
	}

	public double subtract(double a, double b) {
		double answer = a - b;
		return answer;
	}


}
