/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int numberofduplicates = 0;
		String name = randName();
		int age = (int)((Math.random()*101)+1);
		PooleDwarf a = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf b = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf c = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf d = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf e = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf f = new PooleDwarf(name, age);
		name = randName();
		age = (int)((Math.random()*101)+1);
		PooleDwarf g = new PooleDwarf(name, age);
		if(a.getName().equals(b.getName())){
			numberofduplicates++;
		}
		if(a.getName().equals(c.getName())){
			numberofduplicates++;
		}
		if(a.getName().equals(d.getName())){
			numberofduplicates++;
		}
		if(a.getName().equals(e.getName())){
			numberofduplicates++;
		}
		if(a.getName().equals(f.getName())){
			numberofduplicates++;
		}
		if(a.getName().equals(g.getName())){
			numberofduplicates++;
		}
		System.out.println("The first Dwarf's name was "+a.getName()+".");
		System.out.println("The first Dwarf's name was the name of "+numberofduplicates+" other dwarves.");

	}
}
