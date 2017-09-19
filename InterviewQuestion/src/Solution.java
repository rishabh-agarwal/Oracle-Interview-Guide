/*Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.
   The first line contains an integer,  (the size of our array). 
   The second line contains  space-separated integers describing array 's elements.

	Sample input : 4 , 1 4 3 2
	sample output: 2 3 4 1
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void printArray(int[] array) {
		for(int k=0; k<=array.length-1; k++)
		{
			System.out.print(array[k]+" ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the size of the array and the elements in the array!");
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		in.close();
		printArray(arr);
		
		int[] revArray = new int[arr.length];
		int index = 0;
	    
		for(int j=revArray.length-1; j>=0 ;j--) {
	    	  revArray[index] = arr[j];
		  index++;
	    }
	  //System.out.println(Arrays.toString(revArray));
		printArray(revArray);
	}
}
