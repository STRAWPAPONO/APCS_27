/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int bark = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String givenname = sc.nextLine();
		Dog a = new Dog(givenname);
		String dogname = a.getName();
		String dogbreed = a.getBreed();
		int dogage = a.getAge();
		System.out.println("What age should Ren be?");
		dogage = sc.nextInt();
		a.setAge(dogage);
		Dog b = new Dog("Lucy", "Siberian Husky");
		System.out.println(dogname+" is a "+dogbreed+" that is "+dogage+" years old!");
		String dogname1 = b.getName();
		String dogbreed1 = b.getBreed();
		int dogage1 = b.getAge();
		System.out.println(dogname1+" is a "+dogbreed1+" that is "+dogage1+" years old!");
		boolean isdogsleeping = a.isSleeping();
		if(isdogsleeping==true){
			System.out.println(dogname+" is sleeping.");
		}
		if(isdogsleeping==false){
			bark = 1;
			System.out.println(dogname+" is awake!");
			a.bark();
		}
		isdogsleeping = b.isSleeping();
		if((isdogsleeping==true)&&(bark==1)){
			System.out.println(dogname1+" wakes up from hearing "+dogname+".");
			b.bark();
		}
		if((isdogsleeping==false)&&(bark==1)){
			System.out.println(dogname1+" hears "+dogname+".");
			b.bark();
		}
		if((isdogsleeping==true)&&(bark==0)){
			System.out.println(dogname1+" is awake.");
			}
		if((isdogsleeping==false)&&(bark==0)){
			System.out.println(dogname1+" is asleep.");
			}
		}
	}

