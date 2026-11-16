/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int count = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		int [] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random()*10)+1);
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		int randomnum = (int)((Math.random()*10)+1);
		int totalamount = 0;
		System.out.println("The random number was "+randomnum);
		for(int i1 = 0; i1<arr.length; i1++){
			if(arr[i1]==randomnum){
				System.out.println("Duplicate found at index "+i1);
				totalamount++;
			}
		}
		System.out.println("Total number of duplicates for "+randomnum+" is "+totalamount);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row:");
		for(int i2 = 0; i2<arr.length; i2++){
			if(((i2!=(arr.length-1)))&&(arr[i2]==arr[i2+1])){
				System.out.println("Two in a row found at indexes "+i2+" and "+(i2+1)+". The number is "+arr[i2]);
			}
		}
		System.out.println("----------------------------------------------------");

		
		
	}
}
