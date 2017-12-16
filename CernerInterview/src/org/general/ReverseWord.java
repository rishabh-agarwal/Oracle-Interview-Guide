/*
 * @author: Rishabh Agarwal
 * 
 * Reverse a word
 * 
 */
package org.general;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a word to be reverse!");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		char[] wordArray = word.toCharArray();
		
		for(int i=wordArray.length-1 ; i>=0;i--) {
			System.out.print(wordArray[i]);
		}
		
		
	}
}
