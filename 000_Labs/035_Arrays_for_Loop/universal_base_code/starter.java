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
		for(int i = 1000; i >= 0; i--){
			arr[i] = (int)((Math.random()*1000)+1);
		}
		for(int count = 0; count <= 1000; count++){
			System.out.print(arr[count]+" ");
		}


		
	}
}
