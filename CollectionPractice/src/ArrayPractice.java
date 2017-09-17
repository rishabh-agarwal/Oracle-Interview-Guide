import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void printArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			String item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// int[] intArray1 = new int[3];
		int[] intArray1;
		int[] intArray2 = new int[4];
		printArray(intArray2);
		int[] intArray3 = { 5, 2, 9, 1, 3 };

		String[] shoppingList = { "bananas", "apples", "pears" };

		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;

		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println(" ");

		System.out.println("This is using Print Method");
		// Custom print out arrays
		printArray(intArray2);
		printArray(intArray3);
		System.out.println(" ");

		// Retrieve Objects
		System.out.println("Retrieve object");
		System.out.println(intArray2[3]);
		System.out.println(Array.get(intArray2, 3));

		// Given Functions
		Arrays.sort(intArray3);
		printArray(intArray3);

		// Print String Array
		System.out.println("Printing String Array");
		printArray(shoppingList);
		System.out.println("");

		System.out.println("Special For Loop:");
		// special For Loop:foreach
		for (String s : shoppingList) {
			System.out.println(s);
		}

	}

}
