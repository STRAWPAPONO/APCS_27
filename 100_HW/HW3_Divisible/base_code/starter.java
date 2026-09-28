/*
 *	Author: Branden Chung
 *  Date: 9/24/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner n1 = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num1 = n1.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = n1.nextInt();
		System.out.println();
		int equal = (num1%2);
		int equal1 = (num1%3);
		int equal2 = (num1%4);
		int equal3 = (num1%5);
		if(equal==0){
			System.out.println(num1+" is even.");
		}
		else{
			System.out.println(num1+" is odd.");
		}
		if((equal1!=0) && (equal2!=0) && (equal3!=0)){
			System.out.println(num1+" is not divisible by 3, 4, or 5");
		}
		else{
		}
		System.out.println();
		equal = (num2%2);
		equal1 = (num2%3);
		equal2 = (num2%4);
		equal3 = (num2%5);
		if(equal==0){
			System.out.println(num2+" is even.");
		}
		else{
			System.out.println(num2+" is odd.");
		}
		if((equal1!=0) && (equal2!=0) && (equal3!=0)){
			System.out.println(num2+" is not divisible by 3, 4, or 5");
		}
		else{
	
		}
	}
}
