/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Branden Chung");
		BankAccount c = new BankAccount("Ren Bolen", 1000.0);
		BankAccount d = new BankAccount("Justin Pyo", -1000.0);
		
		a.printAccountDetails();
		System.out.println();
		b.printAccountDetails();
		System.out.println();
		c.printAccountDetails();
		System.out.println();
		d.printAccountDetails();
		System.out.println();
		


		
	}
}
