
public class RecursionGOODLUCK {
	
	public static int Summation(int n) {
		if (n<=0) {
			return 0;
			}
		else
			{
			return n + Summation(n-1);
			}
	}
	 
	public static int Factorial(int n) {
		if(n<=1) {
			return 1;
		} 
		else {
		
			return n * Factorial(n-1);
		}
	}
	
	public static int exponentiation(int n, int p) {
		if(p <= 0) {
			return 1;
		}
		else {
			return n * exponentiation(n, p-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Summation "+Summation(10));
		System.out.println("Factorial "+Factorial(10));
		System.out.println("Exponentiation "+ exponentiation(10,2));
	}
}