/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[1001];
		int numberofarr = arr.length - 1;
		int value = 0;
		while(numberofarr>=0){
			value+=3;
			arr[numberofarr] = value;
			System.out.print(arr[numberofarr]+" ");
			numberofarr--;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int [] arr1 = new int[1001];
		int numberofarr1 = arr1.length - 1;
		int value1 = 1001;
		while(numberofarr1>=0){
			value1--;
			arr1[numberofarr1] = value1;
			System.out.print(arr1[numberofarr1]+" ");
			numberofarr1--;
		}
}
}
