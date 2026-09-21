/*
 *	Author: Branden	Chung
 *  Date: 9/17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int num1 = n1.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int num2 = n1.nextInt();
		System.out.println();
		System.out.println("Your range is "+num1+" to "+num2+".");
		System.out.println("Here are 5 numbers generated in that range!");
		int random = (((int)(Math.random()*(num2-num1)))+num1);
		System.out.print(random+", ");
		random = (((int)(Math.random()*(num2-num1)))+num1);
		System.out.print(random+", ");
		random = (((int)(Math.random()*(num2-num1)))+num1);
		System.out.print(random+", ");
		random = (((int)(Math.random()*(num2-num1)))+num1);
		System.out.print(random+", ");
		random = (((int)(Math.random()*(num2-num1)))+num1);
		System.out.println(random);

	}
}
