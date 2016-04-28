package com.bedding;

public class Compute {
	
	private String operator;
	private double a;
	private double b;
	private Calculator calc;
	public Compute() {
		
	}
	
	
	public Compute(String operator, double a, double b) {
		 calc = new Calculator(a, b);
		this.operator = operator;
		this.a = a;
		this.b = b;
	}
	
	public double computeResult() {
		double ans = 0.0;
		if(operator.contains("+")) {
			ans = calc.add(a, b);
		}else if(operator.contains("-")) {
			ans = calc.subtract(a, b);
		}else if(operator.contains("/")) {
			ans = calc.divide(a, b);
		}else if(operator.contains("*")) {
			ans = calc.multiply(a, b);
		}else if(operator.contains("%")) {
			ans = calc.findReminder(a, b);
		}else {
			ans = calc.processError(a, b);
		}
		return ans;
	}

}

