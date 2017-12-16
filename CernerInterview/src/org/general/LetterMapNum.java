package org.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterMapNum {

	public static void displayResult(String a) {
		
		String result;
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "0");
		map.put("B", "1");
		map.put("C", "2");
		map.put("D", "3");
		map.put("E", "4");
		map.put("F", "5");
		map.put("G", "6");
		map.put("H", "7");
		map.put("I", "8");
		map.put("J", "9");
		
		result = map.get(a);
		System.out.print(result);
	}
	
	public static void main(String[] args) {

		String temp, input = "ABCD";

		char[] arr = input.toCharArray();
		for (char c : arr) {
			temp = Character.toString(c);
			displayResult(temp);
		}
	}

}
