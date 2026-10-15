/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int number1 = sc.nextInt();
	System.out.println("What is your exponent number?");
	int number2 = sc.nextInt();
	pow(number1, number2);
	}
public static void pow(int number1, int number2){
	int a = number1;
	int b = number2;
	int total = 1;
	if(b>0){
		while(b>0){
			total = total*a;
			b = b-1;
		}
		System.out.println("Your answer is "+total+".");
		return;
	}
	else if(b==0){
		total = 1;
		System.out.println("Your answer is "+total+".");
		return;
	}
}
}
