/*
 *	Author:  Branden Chung
 *  Date: 9/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner i1 = new Scanner(System.in);
		Scanner pi1 = new Scanner(System.in);
		Scanner qi1 = new Scanner(System.in);
		Scanner tip1 = new Scanner(System.in);
		System.out.print("What's the name of your restaurant? ");
		String name = n1.nextLine();
		System.out.println();
		System.out.print("What's your name? ");
		String name2 = n2.nextLine();
		System.out.println();
		System.out.println("Great to see you, "+name2+"! Let's set up a menu for "+name+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String item1 = i1.nextLine();
		System.out.print("Price of "+item1+" ($): ");
		double pitem1 = pi1.nextDouble();
		System.out.print("How many "+item1+"s would you like? ");
		double qitem1 = qi1.nextDouble();
		System.out.println("Added "+qitem1+"x "+item1+"s to your order! "+"($"+(qitem1*pitem1)+")");
		System.out.println();
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2 = i1.nextLine();
		System.out.print("Price of "+item2+" ($): ");
		double pitem2 = pi1.nextDouble();
		System.out.print("How many "+item2+"s would you like? ");
		double qitem2 = qi1.nextDouble();
		System.out.println("Added "+qitem2+"x "+item2+"s to your order! "+"($"+(qitem2*pitem2)+")");
		System.out.println();
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3 = i1.nextLine();
		System.out.print("Price of "+item3+" ($): ");
		double pitem3 = pi1.nextDouble();
		System.out.print("How many "+item3+"s would you like? ");
		double qitem3 = qi1.nextDouble();
		System.out.println("Added "+qitem3+"x "+item3+"s to your order! "+"($"+(qitem3*pitem3)+")");
		System.out.println();
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double tip = tip1.nextDouble();
		System.out.println();
		System.out.println("=================================================");
		System.out.println("           "+name+" - Menu for Today              ");
		System.out.println("=================================================");
		System.out.println("Owner "+name2);
		System.out.println("=================================================");
		System.out.println("-------------------------------------------------");
		System.out.println("Item                Qty     Price               ");
		System.out.println("-------------------------------------------------");
		System.out.println(item1+"            "+qitem1+"      "+(qitem1*pitem1));
		System.out.println(item2+"            "+qitem2+"      "+(qitem2*pitem2));
		System.out.println(item3+"            "+qitem3+"      "+(qitem3*pitem3));
		System.out.println("-------------------------------------------------");
		System.out.println("Subtotal:                     "+((qitem1*pitem1)+(qitem2*pitem2)+(qitem3*pitem3)));
		double subtotal = ((qitem1*pitem1)+(qitem2*pitem2)+(qitem3*pitem3));
		System.out.println("Tax (9.75%):                  "+(((qitem1*pitem1)+(qitem2*pitem2)+(qitem3*pitem3))*0.0975));
		double tax = (subtotal*0.0975);
		System.out.println("Tip:                          "+tip+"%");
		System.out.println("Tip Amount:                   "+(((subtotal)+(tax))*(tip*0.01)));
		double tipa = ((subtotal)+(tax))*(tip*0.01);
		System.out.println("=================================================");
		System.out.println("TOTAL:                        "+"$"+(tipa+tax+subtotal));
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thanks for eating at "+name+"!");
		System.out.println("Come back soon -- we'll always have a byte for you!");



		
		



		

		
	}
}
