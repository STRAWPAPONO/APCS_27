/*
	Author: Branden Chung
	Date: 10/27/26
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman a = new Spiderman();
		Spiderman Ren = new Spiderman("Ren Bolen", 15, "Justin Pyo");
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
		
		a.setActor("Miles Morales");
		a.setVillain("Kingpin");
		System.out.println(a.getActor());
	}
}
