/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Chungus ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int option = sc.nextInt();
		sc.nextLine();
		if(option == 1){
			BankAccount a = new BankAccount();
			System.out.println();
			a.printAccountDetails();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String yn = sc.nextLine();
			if(yn.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance"+a.AccountBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			if(yn.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked ");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			else{
				System.out.println("You don't like to listen to instructions >:(");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
		}
		if(option == 2){
			System.out.println("What is the name of the owner of this bank account?");
			String nameofaccount = sc.nextLine();
			System.out.println();
			BankAccount a = new BankAccount(nameofaccount);
			a.printAccountDetails();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String yn = sc.nextLine();
			if(yn.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance"+a.AccountBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			if(yn.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked ");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			else{
				System.out.println("You don't like to listen to instructions >:(");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
		}
		if(option == 3){
			System.out.println("What is the name of the owner of this bank account?");
			String nameofaccount = sc.nextLine();
			System.out.println("How much are you initially depositing into this account?");
			double initialbalance = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			BankAccount a = new BankAccount(nameofaccount, initialbalance);
			a.printAccountDetails();
			System.out.println();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String yn = sc.nextLine();
			if(yn.equalsIgnoreCase("yes")){
				System.out.println("Current Account Balance"+a.AccountBalance());
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			if(yn.equalsIgnoreCase("no")){
				System.out.println("Great! No balance checked ");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
			else{
				System.out.println("You don't like to listen to instructions >:(");
				System.out.println();
				System.out.println("Thank you for coming to the Chungus ATM!");
				System.exit(0);
			}
		}
		if((option != 3)||(option != 2)||(option != 1)){
			System.out.println("Account unsuccesfully created. Please try again later.");
		}
	}
}
