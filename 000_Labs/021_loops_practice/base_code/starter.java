/*
 *	Author:  Branden Chung
 *  Date: 10/6
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		System.out.print("Please guess a number: ");
		int guess = sc.nextInt();
		int randomnumber = (int)((Math.random()*1001)+1);
		while(guess!=randomnumber){
			if(guess>randomnumber){
				System.out.println("The number is lower.");
				System.out.print("Please guess a number: ");
				guess = sc.nextInt();
			}
			if(guess<randomnumber){
				System.out.println("The number is higher.");
				System.out.print("Please guess a number: ");
				guess = sc.nextInt();
			}
		}
		System.out.println("You guessed the correct number. The number was "+randomnumber+".");

	
		
		



		
	}
}
