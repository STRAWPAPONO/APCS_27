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
		System.out.println("--- Account Info ---");
		System.out.println("Owner Name: "+name);
		System.out.println("Balance: $"+Balance);
		if(isActive==true){
			System.out.println("Account Status: Active");
		}
		else{
			System.out.println("Account Status: Inactive");
		}
		System.out.println("Account Number: "+Acn);
	}
	public double AccountBalance(){
		double accountbalance = Balance;
		return accountbalance;
	}
	public void setOwner(String a){
		name = a;
	}
	public String getOwner(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		isActive == false;
	}
	public boolean isActive(){
		return isActive;
	}
	public void depositMoney(double a){
		if(isActive==true){
			balance += a
		}
	}
	public void withdrawMoney(double a){
		if((balance>=a)&&(isActive==true)){
			balance -= a;
		}
	}

}