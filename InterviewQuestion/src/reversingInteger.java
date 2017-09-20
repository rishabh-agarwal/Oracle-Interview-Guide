import java.util.Scanner;

public class reversingInteger {
	
	public void printResult(int num) {
		System.out.println("The Reverse Number: "+ num);
	}
	
	public void reverseNumber(int num) {
		int reverse = 0;
		while(num != 0)
		{
			reverse = (reverse*10)+(num%10);
			num = num/10; 
		}
		printResult(reverse);
	}
	
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number to be reversed?");
		int inputNum = sc.nextInt();
		reversingInteger obj = new reversingInteger();
		obj.reverseNumber(inputNum);
	}
}
