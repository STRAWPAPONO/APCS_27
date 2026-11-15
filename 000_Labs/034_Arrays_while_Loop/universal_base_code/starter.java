/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int[1001];
		int i = 1000;
		int count = 0;
		while(i>0){
			arr[i] = (int)((Math.random()*1001)+1);
			System.out.print(arr[i]+" ");
			i--;
			count++;
		}
		System.out.println(count+" values were printed.");
}
}
