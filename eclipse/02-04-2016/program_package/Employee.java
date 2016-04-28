package program_package;

public abstract class Employee {
	
	
	
	private double salary;
	
	

	public Employee( double salary) {
		this.salary = salary;
	}
	
	
	public double calculateBonus() {
		double bonus = 0.0;
		if(salary <= 10000) {
			bonus = 0.6 * salary;
		}else if(salary >= 10001 && salary <= 33000) {
			bonus = 0.4 * salary;
		}else if(salary >= 33001 && salary <= 125000) {
			bonus = 0.2 * salary;
		}else {
			bonus = 0.0;
		}		
		return bonus;
	}
	
	
	public double showSalaryWithBonus() {
		salary = calculateBonus()  + salary;
		return salary;
	}
	
	public abstract void showCompanyName() ;
	
	

}
