/*
 * To Reverse a String Steps
 * First create a new [] bytetype, StringBuilder, Char and then reverse.
 * byte- input.getByte()
 * StringBuilder - result.append(input)
 */


import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
	
	static Scanner sc = new Scanner(System.in);
	
	public void traditionalReverse (String inputString) {
		
		int index = 0;
		byte[] inputStringAsByteArray = inputString.getBytes();
		byte[] result = new byte[inputStringAsByteArray.length];
		
		for(int i=0; i<inputStringAsByteArray.length; i++) {
			result[i] = inputStringAsByteArray[inputStringAsByteArray.length-i-1];
		}
		
		System.out.println(new String(result));
	}
	
	
	/*using String Builder*/
	public void reverseWithStringBuilder (String inputString) {
		
		StringBuilder inputStringBuilder = new StringBuilder();
		inputStringBuilder.append(inputString);
		inputStringBuilder.reverse();
		
		for(int i=0;i<inputStringBuilder.length();i++)
		{
			System.out.print(inputStringBuilder.charAt(i));
		}
		
	}
	
	/*Using Char array*/
	public void reverseWithCharArray(String inputString)
	{
		char[] inputCharArray = inputString.toCharArray();
		
		for(int i = inputCharArray.length-1; i>=0; i--)
		{
			System.out.print(inputCharArray[i]);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String to be reversed");
		String inputString = sc.nextLine();
		
		reverseString reverse = new reverseString();
		
		System.out.println("traditionalReverse:");
		reverse.traditionalReverse(inputString);
		System.out.println("reverseWithStringBuilder:");
		reverse.reverseWithStringBuilder(inputString);
		System.out.println();
		System.out.println("reverseWithCharArray:");
		reverse.reverseWithCharArray(inputString);
	}
	
	
}
