package org.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Maths maths = new Maths();
	   
		double answer = 0;
		double inputA = 0, inputB = 0;
		char operator = 0;
		boolean done = false;
		
		while (done == false) {
			System.out.print("Please enter your number and operation:");	
			inputA = sc.nextDouble();
			operator = sc.next().charAt(0);
			inputB = sc.nextDouble();
		
			switch(operator) {
			case '+': answer = maths.add(inputA, inputB);
			break;
			case '-': answer = maths.substract(inputA, inputB);
			break;
			case '*': answer = maths.multiply(inputA, inputB);
			break;
			case '/': answer = maths.divide(inputA, inputB);
			break;
			case '^': answer = maths.power(inputA, inputB);
			break;
			
			
			}
			System.out.println(answer);
		}
		sc.close();
	}

}
