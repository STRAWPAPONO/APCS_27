/*
 *	Author:  Branden Chung
 *  Date: 9/30/26
*/

import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int strength = 0;
		int dexterity = 0;
		int intelligence = 0;
		int cons = 0;
		int chari = 0;
		int totalpoints = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your title? Ex. Slayer of Dragons");
		String title = input.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String option = input.nextLine();
		if((option.equals("Wizard")) || (option.equals("wizard")) || (option.equals("Warrior")) || (option.equals("warrior")) || (option.equals("Rogue")) || (option.equals("rogue"))) {
			if((option.equals("Wizard")) || (option.equals("wizard"))) {
				System.out.println("You've chosen the Wizard! Excelsior!");
			}
			if((option.equals("Warrior")) || (option.equals("warrior"))) {
				System.out.println("You've chosen the Warrior! For honor!");
			}
			if((option.equals("Rogue")) || (option.equals("rogue"))) {
				System.out.println("You've chosen the Rogue! How cunning!");
			}
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
			System.exit(0);
		}
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend the wisely.");
		System.out.println();
		System.out.print("Strength (1-10): ");
		totalpoints = 20;
		strength = input.nextInt();
		if((strength<=(totalpoints-10)) && (strength>=0)) {
			totalpoints = (20-strength);
			System.out.println("You have "+totalpoints+" left to spend.");
		}
		else{
			System.out.println("Please input a smaller value.");
			System.out.print("Strength (1-10): ");
			strength = input.nextInt();
			if((strength<=(totalpoints-10)) && (strength>=0)) {
				totalpoints = (totalpoints-strength);
				System.out.println("You have "+totalpoints+" left to spend.");
			}
			else {
				if(strength<=20) {
				totalpoints = (totalpoints-strength);
				System.out.println("You have "+totalpoints+" left to spend.");
				}
				else {
					System.out.println("Please choose a valid number next time.");
					System.exit(0);
				}

			}

		}
		if(totalpoints==0){
			System.out.println("You have no more points left.");
		}
		else{
		System.out.println();
		System.out.print("Dexterity (1-10): ");
		dexterity = input.nextInt();
		if((dexterity<=(totalpoints)) && (dexterity>=0) && (dexterity<=10)) {
			totalpoints = (totalpoints-dexterity);
			System.out.println("You have "+totalpoints+" left to spend.");
		}
		else{
			System.out.println("Please input a smaller value.");
			System.out.print("Dexterity (1-10): ");
			dexterity = input.nextInt();
			if((dexterity<=(totalpoints)) && (dexterity>=0)) {
				totalpoints = (totalpoints-dexterity);
				System.out.println("You have "+totalpoints+" left to spend.");
			}
			else {
				if(dexterity<=20) {
				totalpoints = (totalpoints-dexterity);
				System.out.println("You have "+totalpoints+" left to spend.");
				}
				else {
					System.out.println("Please choose a valid number next time.");
					System.exit(0);
				}

			}

		}
		}
		if(totalpoints==0){
			System.out.println("You have no more points left.");
		}
		else{
		System.out.println();
		System.out.print("Intelligence (1-10): ");
		intelligence = input.nextInt();
		if((intelligence<=(totalpoints)) && (intelligence>=0) && (intelligence<=10)) {
			totalpoints = (totalpoints-intelligence);
			System.out.println("You have "+totalpoints+" left to spend.");
		}
		else{
			System.out.println("Please input a smaller value.");
			System.out.print("Intelligence (1-10): ");
			intelligence = input.nextInt();
			if((intelligence<=totalpoints) && (intelligence>=0)) {
				totalpoints = (totalpoints-intelligence);
				System.out.println("You have "+totalpoints+" left to spend.");
			}
			else {
				if(intelligence<=totalpoints) {
				totalpoints = (totalpoints-intelligence);
				System.out.println("You have "+totalpoints+" left to spend.");
				}
				else {
					System.out.println("Please choose a valid number next time.");
					System.exit(0);
				}

			}

		}
		}
		if(totalpoints==0){
			System.out.println("You have no more points left.");
		}
		else{
		System.out.println();
		System.out.print("Constitution (1-10): ");
		cons = input.nextInt();
		if((cons<=(totalpoints)) && (cons>=0) && (cons<=10)) {
			totalpoints = (totalpoints-cons);
			System.out.println("You have "+totalpoints+" left to spend.");
		}
		else{
			System.out.println("Please input a smaller value.");
			System.out.print("Constitution (1-10): ");
			cons = input.nextInt();
			if((cons<=(totalpoints)) && (cons>=0)) {
				totalpoints = (totalpoints-cons);
				System.out.println("You have "+totalpoints+" left to spend.");
			}
			else {
				if(cons<=20) {
				totalpoints = (totalpoints-cons);
				System.out.println("You have "+totalpoints+" left to spend.");
				}
				else {
					System.out.println("Please choose a valid number next time.");
					System.exit(0);
				}

			}

		}
		}
		if(totalpoints==0){
			System.out.println("You have no more points left.");
		}
		else{
		System.out.println();
		System.out.print("Charisma (1-10): ");
		chari = input.nextInt();
		if((chari<=(totalpoints)) && (chari>=0) && (chari<=10)) {
			totalpoints = (totalpoints-chari);
			System.out.println("You have "+totalpoints+" left to spend.");
		}
		else{
			System.out.println("Please input a smaller value.");
			System.out.print("Charisma (1-10): ");
			chari = input.nextInt();
			if((chari<=(totalpoints)) && (chari>=0)) {
				totalpoints = (totalpoints-chari);
				System.out.println("You have "+totalpoints+" left to spend.");
			}
			else {
				if(chari<=20) {
				totalpoints = (totalpoints-chari);
				System.out.println("You have "+totalpoints+" left to spend.");
				}
				else {
					System.out.println("Please choose a valid number next time.");
					System.exit(0);
				}

			}

		}

	}
	if(totalpoints>=0){
		System.out.println("You have "+totalpoints+" points remaining.");
	}
	System.out.println("--------------------------------------------------");
	System.out.println("You are "+name+", the "+title+" of CVHS.");
	System.out.println("You're a "+option+" with the following stats!");
	System.out.println("Strength - " + strength);
	System.out.println("Dexterity - " + dexterity);
	System.out.println("Intelligence - " + intelligence);
	System.out.println("Charisma - " +chari);
	System.out.println();
	System.out.println("Good luck on your quest "+name+"!");



	}
}
