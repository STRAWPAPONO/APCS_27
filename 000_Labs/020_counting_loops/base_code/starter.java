/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.print("How many times would you like to print your name? ");
		int number = sc.nextInt();
		while(true){
			if(count==number){
				break;
			}
			System.out.println(name);
			count = count + 1;
		}




		
	}
}
