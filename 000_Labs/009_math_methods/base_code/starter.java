/*
 *	Author:  Branden Chung
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int m1 = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double m2 = Math.sqrt(3 * 8 + 31 % 7);
		double m3 = Math.pow(37 / 3, 35 % 21);
		double m4 = Math.max((Math.pow( 2,14%3)) , Math.sqrt(2*6));
		System.out.println("Maximum = "+m1);
		System.out.println("Square root = "+m2);
		System.out.println("Power = "+m3);
		System.out.println("Max = "+m4);
		
	}
}
