import java.util.Scanner;

/*
 * Program to print prime number from 1 to N 
 */
public class printPrimeNumber {
	public static void main(String[] args) {
		int n, p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upto which number prime numbers are needed");
	    n = s.nextInt();
		
	    for(int i=2; i<n ;i++)
		{
			p=0;
			for (int j=2;j<i;j++) {
				
				if(i%j==0) {
					p=1;
				}
		}
			if(p==0)
				System.out.println(i);
		
		}
	}
}
