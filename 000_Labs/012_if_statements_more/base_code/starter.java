/*
 *	Author:  Branden Chung
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("The first variable is ");
	int num1 = sc.nextInt();
	System.out.print("The second variable is ");
	int num2 = sc.nextInt();
	boolean equal = (num1==num2);
	if(equal==true){
			System.out.println("The numbers are equal");
	}
	if(equal==false){
		System.out.println("The numbers are different");
	}	
	}
}
