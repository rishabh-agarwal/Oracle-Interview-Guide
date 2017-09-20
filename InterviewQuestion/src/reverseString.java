import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
	
	static Scanner sc = new Scanner(System.in);
	
	public void traditionalReverse (String inputString) {
		
		int index = 0;
		byte[] inputStringAsByteArray = inputString.getBytes();
		byte[] result = new byte[inputStringAsByteArray.length];
		
		/*System.out.println("Byte Array: "+Arrays.toString(inputStringAsByteArray));
		System.out.println("Length of the Array: "+ inputStringAsByteArray.length);*/
		
		for(int i=0; i<inputStringAsByteArray.length; i++) {
			result[i] = inputStringAsByteArray[inputStringAsByteArray.length-i-1];
		}
		
		System.out.println(new String(result));
	}
	
	public void reverseWithStringBuilder (String inputString) {
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String to be reversed");
		String inputString = sc.nextLine();
		
		reverseString reverse = new reverseString();
		reverse.traditionalReverse(inputString);
		reverse.reverseWithStringBuilder(inputString);
	}
	
	
}
