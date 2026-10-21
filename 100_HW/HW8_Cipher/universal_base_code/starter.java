/*
 *	Author: branden chung
 *  Date: 10/18/26
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int number = 0;
	 	String code;
	 	String message = "";
		Scanner sc = new Scanner(System.in);
	 	code = sc.nextLine();
	 	while(true){
	 	number = sc.nextInt();
	 	message = Cipher.keyedEncode(code, number);
	 	System.out.println(message);
	 }
	//String encoder = sc.nextLine();
	//String message2 = Cipher.encode(encoder);
	//System.out.println(message2);
	}
}
