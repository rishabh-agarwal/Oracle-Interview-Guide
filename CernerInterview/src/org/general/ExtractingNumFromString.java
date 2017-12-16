package org.general;

import java.util.Scanner;

public class ExtractingNumFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence");
		String input = sc.nextLine();
		
		String result = input.replaceAll("^[0-9]", "");
		
		System.out.println(result);
	}

}
