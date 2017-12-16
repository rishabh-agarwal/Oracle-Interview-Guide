/*
 * @author: Rishabh Agarwal
 * 
 * Convert Decimal number to Binary
 */

package org.general;
public class BinaryToDecimal {

	public static void main(String[] args) {
		String binaryNumber = "110010";
		int decimal = 50;
		int binary =110010;
		
		int decimalValue = Integer.parseInt(binaryNumber, 2);
		
		String hexa = Integer.toHexString(decimal);
		
		System.out.println(decimalValue);
		System.out.println(hexa);
		
	}

}
