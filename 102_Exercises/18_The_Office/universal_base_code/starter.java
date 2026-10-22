/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		double annualsalary = 0;
		Employee michael = new Employee();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee Pam  = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee Ren = new Employee(9999, "Ren", "Bolen", 10000.0);

		Jim.raiseSalary(20);
		Pam.raiseSalary(10);
		Ren.raiseSalary(1000);
		Dwight.raiseSalary(50);

		Jim.employeeToString();
		annualsalary = Jim.getAnnualSalary();
		System.out.println("Annual Salary: $"+annualsalary);
		System.out.println();
		Pam.employeeToString();
		annualsalary = Pam.getAnnualSalary();
		System.out.println("Annual Salary: $"+annualsalary);
		System.out.println();
		michael.employeeToString();
		annualsalary = michael.getAnnualSalary();
		System.out.println("Annual Salary: $"+annualsalary);
		System.out.println();
		Ren.employeeToString();
		annualsalary = Ren.getAnnualSalary();
		System.out.println("Annual Salary: $"+annualsalary);
		System.out.println();
		Dwight.employeeToString();
		annualsalary = Dwight.getAnnualSalary();
		System.out.println("Annual Salary: $"+annualsalary);
		System.out.println();



		
	}
}
