package org.general;

import java.util.Iterator;
import java.util.*;

public class ReverseSentance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance");
		String inputString = sc.nextLine();

		String[] words = inputString.split(" ");

		for (int i = words.length-1 ; i >= 0; i--) {
			System.out.print(words[i] +" ");
		}
	}
}