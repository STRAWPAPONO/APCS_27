/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String a = sc.nextLine();
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		System.out.println();
		System.out.println("This is using the methods!");
		words(a);
		words2(a, b);

	}
	public static void words(String a){
		System.out.println(a);
		return;
	}
	public static void words2(String a, String b){
		System.out.println(a+" "+b);
		return;
	}
}
