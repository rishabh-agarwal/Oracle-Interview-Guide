import java.util.Scanner;

public class StringBuilderReverse {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String");
        String inputString = sc.nextLine();
		StringBuilder result = new StringBuilder();
		result.append(inputString);
		result.reverse();
		for(int i=0 ; i<result.length();i++)
		{
			System.out.print(result.charAt(i));
		
		}
	}
}
