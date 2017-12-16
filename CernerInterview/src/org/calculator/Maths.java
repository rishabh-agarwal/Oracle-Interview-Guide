package org.calculator;

public class Maths {

	double add(double a, double b) {
		return a+b;
	}
	
	double divide(double a, double b) {
		return a/b;
	}
	double multiply(double a, double b) {
		return a*b;
	}
	
	double power(double a, double b) {
		for(double i = b; i>0 ;i--)
		{
			a += a;
		}
		return a;
	}
	double substract(double a, double b) {
		double answer = a -b;
		return answer;
	}
	
}
