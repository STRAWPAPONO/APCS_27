/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
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
		System.out.print("Strength (1-10):");
	}
}
