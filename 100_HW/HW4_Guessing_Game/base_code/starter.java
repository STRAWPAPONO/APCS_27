/*
 *	Author: Branden Chung
 *  Date: 9/25/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner n1 = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		int game = (int)((Math.random()*3)+1);
		if(game==1){
			System.out.println("It's a subject!");
			System.out.print("What is your guess? ");
			String guess = n1.nextLine();
			if((guess.equals("Math")) || (guess.equals("math"))){
				System.out.println();
				System.out.println("You got it Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("It includes symbols and numbers! ");
				guess = n1.nextLine();
				if((guess.equals("Math")) || (guess.equals("math"))){
					System.out.println();
					System.out.println("You got it Woo!");
				}
				else{
					System.out.println("The answer was Math, better luck next time!");
				}
				

			}


		}
		if(game==2){
			System.out.println("It's a fruit!");
			System.out.print("What is your guess? ");
			String guess = n1.nextLine();
			if((guess.equals("Orange")) || (guess.equals("orange"))){
				System.out.println();
				System.out.println("You got it Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("It might be a little annoying... ");
				guess = n1.nextLine();
				if((guess.equals("Orange")) || (guess.equals("orange"))){
					System.out.println();
					System.out.println("You got it Woo!");
				}
				else{
					System.out.println("The answer was Orange, better luck next time!");
				}
				

			}



		}
		if(game==3){
			System.out.println("Its a Pokemon");
			System.out.print("What is your guess? ");
			String guess = n1.nextLine();
			if((guess.equals("Weedle")) || (guess.equals("weedle"))){
				System.out.println();
				System.out.println("You got it Woo!");
			}
			else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("The pokemon resembles a caterpillar ");
				guess = n1.nextLine();
				if((guess.equals("weedle")) || (guess.equals("Weedle"))){
					System.out.println();
					System.out.println("You got it Woo!");
				}
				else{
					System.out.println("The answer was Weedle, better luck next time!");
				}
				

			}



		}
	}
}
