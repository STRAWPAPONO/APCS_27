/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int tokens = 100;
		Scanner sc = new Scanner(System.in);
		String q1 = "nothin";
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		while(true){
			if(tokens == 0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
			q1 = sc.nextLine();
			while(true){
				if((q1.equals("Yes"))||(q1.equals("yes"))||(q1.equals("Y"))||(q1.equals("y"))){
					break;
				}
				if((q1.equals("No"))||(q1.equals("no"))||(q1.equals("N"))||(q1.equals("n"))){
					System.exit(0);
				}
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
				q1 = sc.nextLine();
			}
			System.out.println("You have $"+tokens+". How much would you like to wager? ");
			int wager = sc.nextInt();
			sc.nextLine();
			while(true){
				if((wager>0)&&(wager<=tokens)){
					tokens = tokens-wager;
					break;
				}
				if(wager<=0){
					System.out.println("Sneaky! No negatives or 0!");
					System.out.println("Please enter a bigger number: ");
					wager = sc.nextInt();
				}
				if(wager>tokens){
					System.out.println("You only have $100! Please enter a smaller number: ");
					wager = sc.nextInt();
				}
			}
			System.out.println();
			System.out.println("Great Let's Play!!!");
			System.out.println("Your rolls are: ");
			int n1 = (int)(Math.random()*10)+1;
			int n2 = (int)(Math.random()*10)+1;
			int n3 = (int)(Math.random()*10)+1;
			System.out.println("_______________________");
			System.out.println("  | "+n1+" | "+n2+" | "+n3+" |  ");
			System.out.println("_______________________");
			if((n1==n2)&&(n1==n3)){
				System.out.println("You won 3x the amount you wagered!");
				tokens = tokens + (wager*3);
				System.out.println("You now have $"+tokens+".");
			}
			if(((n1==n2)||(n1==n3))||((n2==n1)||(n2==n3))||((n3==n2)||(n3==n1))){
				System.out.println("You won 2x the amount you wagered!");
				tokens = tokens + (wager*2);
				System.out.println("You now have $"+tokens+".");
			}
			else{
				System.out.println("Didn't win this time, better luck next time!");
				System.out.println("You now have $"+tokens+".");
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println();
			}
		}
	}

}
