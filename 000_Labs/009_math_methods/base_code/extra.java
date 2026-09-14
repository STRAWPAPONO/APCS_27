/*
 *	Author:  Branden Chung
 *  Date: 9/10/26
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		System.out.println("Choose any number");
		double number = n1.nextDouble();
		System.out.println("Choose any other number");
		double number2 = n2.nextDouble();
		double max1 = Math.max(number,number2);
		double sq1 = Math.sqrt(number2);
		double p1 = Math.pow(number,number2);
		System.out.println("The maximum of "+number+" and "+number2+" is "+max1+".");
		System.out.println("The square root of "+number2+" is "+sq1+".");
		System.out.println(number+" to the power of "+number2+" is "+p1+".");

	}
}