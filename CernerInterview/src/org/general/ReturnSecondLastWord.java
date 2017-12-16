package org.general;

import java.util.BitSet;
import java.util.Scanner;

public class ReturnSecondLastWord {


	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentance");
		
		String temp = sc.nextLine();
		String[] sentanceArray = temp.split(" ");
		
		System.out.println("Enter the word position from last to find the word");
		int pos = sc.nextInt();
		
		String lastWord = sentanceArray[sentanceArray.length-pos];
		
		System.out.println(lastWord);
		
		sc.close();
		
	}

}
