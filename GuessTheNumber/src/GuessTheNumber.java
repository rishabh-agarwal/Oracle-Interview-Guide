import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	int theNUMBER;
	int max;
	Scanner scanner = new Scanner(System.in);

	public GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
	}

	public void play() {

		while (true) {
			int move = scanner.nextInt();
			if (move > theNUMBER) {
				System.out.println("Your number is too big");
			} else if (move < theNUMBER) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("YOU GOT IT BRO!");
				break;
			}
		}
	}

	public static void howBigIsMyNumber(int x) {
		if (x >= 0 && x <= 10) {
			System.out.println("Our number is pretty small");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big");
		} else {
			System.out.println("Our number is out of range");
		}
	}

	public static void main(String[] args) {
		
		GuessTheNumber guessNumber = new GuessTheNumber();
		System.out.println("Welcome to my Game, Guess this imposible number. Enter a number b/w 0 and "+ guessNumber.max);
		guessNumber.play();
		/*
		 * howBigIsMyNumber(0); howBigIsMyNumber(10); howBigIsMyNumber(11);
		 * howBigIsMyNumber(-5); howBigIsMyNumber(25); howBigIsMyNumber(100);
		 * howBigIsMyNumber(76); howBigIsMyNumber(-1); howBigIsMyNumber(123);
		 */

	}

}
