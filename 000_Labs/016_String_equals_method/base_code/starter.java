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
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		Scanner input = new Scanner(System.in);
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
		}
	
	}
}
