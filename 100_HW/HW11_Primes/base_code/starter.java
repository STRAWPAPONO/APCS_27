/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int divisible = 0;
		int divisor = a;
		while(divisor>1){
			if((a%divisor)==0){
				divisible++;
			}
			divisor--;
		}
		if(divisible<=1){
			return true;
		}
		else{
			return false;
		}
	}
	public static void printPrimes(int a){
		int maxnumber = a;
		if(maxnumber<=1){
			System.out.println("There are no prime numbers smaller than this number.");
		}
		else{
			System.out.print("All the prime numbers smaller than this number are: ");
			while(maxnumber>1){
				if(checkPrime(maxnumber)==true){
				System.out.print(maxnumber+" ");
			}
				maxnumber--;
			}
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Input a number and we'll print out every prime until that number: ");
		number = sc.nextInt();
		printPrimes(number);
	}
}

