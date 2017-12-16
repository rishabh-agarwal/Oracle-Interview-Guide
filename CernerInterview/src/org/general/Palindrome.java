/*
 * A palindrome number is whoes reverse is same as original. For example 122221, 787
 * 
 */

package org.general;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String original;
		String reverse="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		original = sc.next();
		
		char[] temp = original.toCharArray();
		
		for(int i=temp.length-1; i>=0 ; i--) {
			reverse = reverse+temp[i];
		} 
		
		if(original.equalsIgnoreCase(reverse) )
		{
			System.out.println("Word is Palindrome");
		}
		else {
			System.out.println("Word is not a palindrome :"+reverse);
			
		}
		
		
	}

}
