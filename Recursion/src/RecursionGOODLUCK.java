
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

	public static void main(String[] args) {
		System.out.println(Summation(3));
	}
}
