package program_package;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Salary: ");
		double salary = scan.nextDouble();
		MagentLtd abc = new MagentLtd(salary);
		
		
		double bonus = abc.calculateBonus();
		System.out.println(bonus);
		
		double salaryAfterBonus = abc.showSalaryWithBonus();
		System.out.println(salaryAfterBonus);
		
		
		abc.showCompanyName();

	}

}
