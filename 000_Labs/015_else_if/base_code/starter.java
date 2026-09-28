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
		Scanner n1 = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int chosen = n1.nextInt();
		int random = (int)((Math.random()*1000)+1);
		if(chosen==random){
			System.out.print("Your number was the correct answer. The number was "+random+".");
		}
		else if(chosen>random){
			System.out.print("Your number was greater. The number was "+random+".");
		}
		else if(chosen<random){
			System.out.print("Your number was smaller. The number was "+random+".");
		}
	}
}
