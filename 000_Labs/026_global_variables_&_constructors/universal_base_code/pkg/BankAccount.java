/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String Owner;
	String name;
	int Acn;
	double Balance;
	boolean isActive;
	public static int nextAccountup = (int)((Math.random()*1001)+50);
	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		Balance = 0;
		isActive = true;
		Acn = nextAccountup;
		nextAccountup++;
	}
	public BankAccount(String a){
		name = a;
		Balance = 0;
		isActive = true;
		Acn = nextAccountup;
		nextAccountup++;
	}
	public BankAccount(String a, double b){
		name = a;
		Balance = b;
		isActive = true;
		Acn = nextAccountup;
		nextAccountup++;
	}



	// -------METHODS-------
	public void printAccountDetails(){
		System.out.println("Account Name: "+name);
		System.out.println("Balance: $"+Balance);
		if(isActive==true){
			System.out.println("Account Status: Active");
		}
		else{
			System.out.println("Account Status: Inactive");
		}
		System.out.println("Account Number: "+Acn);
		
	}
}