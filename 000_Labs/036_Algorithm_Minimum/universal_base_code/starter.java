/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	double total = 0;
	int amount = (int)((Math.random()*150)+51);
	int [] arr = new int[amount];
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)((Math.random()*100)+1);
		System.out.print(arr[i]+" ");
		total = total + arr[i];
	}
	int min = 100;
	for(int i1 = 0; i1 < arr.length; i1++){
		if(arr[i1]<min){
			min = arr[i1];
		}
	}
	System.out.println();
	System.out.println("The smallest value was, "+min);
	int max = 0;
	for(int i2 = 0; i2 < arr.length; i2++){
		if(arr[i2]>max){
			max = arr[i2];
		}
	}
	System.out.println("The biggest value was, "+max);
	double average = (total/amount);
	System.out.println("The average of the values was "+average);
		


		
	}
}
