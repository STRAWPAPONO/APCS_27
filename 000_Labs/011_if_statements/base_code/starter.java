/*
 *	Author:  Branden Chung
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int num1 = 14;
		int num2 = 14;
		System.out.println("The first variable is "+num1+".");
		System.out.println("The second variable is "+num2+".");
		boolean equal = (num1==num2);
		if(equal==true){
			System.out.println("The variables are equal");
		}
		if(equal==false){
			System.out.println("The variables are different");
		}
	}
}
