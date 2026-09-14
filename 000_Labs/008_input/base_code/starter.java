/*
 *	Author:  Branden Chung	
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner name = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		Scanner bm = new Scanner(System.in);
		Scanner bd = new Scanner(System.in);
		Scanner by = new Scanner(System.in);
		Scanner m = new Scanner(System.in);
		System.out.println("What's your first name?");
		String namep = name.nextLine();
		System.out.println("What's your age?");
		int agep = age.nextInt();
		System.out.println("What's your birth month (ex. 4,12,2) ?");
		int bmp = bm.nextInt();
		System.out.println("On what day of the month is your birthday? (ex. 1,2,3)");
		int bdp = bd.nextInt();
		System.out.println("What year were you born?");
		int byp = by.nextInt();
		System.out.println("How much money is a dollar and fifty cents?");
		double mp = m.nextDouble();
		System.out.println("Your name is "+namep+".");
		System.out.println("You are "+agep+" years old.");
		System.out.println("You were born on "+bmp+"/"+bdp+"/"+byp+".");
		System.out.println("A dollar and fifty cents is "+mp+".");



	
	}
}
