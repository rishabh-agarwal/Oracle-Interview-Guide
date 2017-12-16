
/*
 * @author: Rishabh Agarwal
 * 
 * Seperate number from character which are seperated by ","
 * 
 */

package org.general;

public class SeperateStringWithNumbers {

	public static void main(String[] args) {
	
		String input = "a,1,b,2,c,3,d,4";
		input = input.replaceAll(",", "");
		
		String alpha ="";
		String num = "";
		
		char[] c_arr = input.toCharArray();
		
		for(char c: c_arr) {
			if(!Character.isDigit(c)) {
				alpha = alpha +" "+ c ;
			}
			else {
				num = num+c+",";
			}
		}
		
		
		System.out.println("Alphabet: "+ alpha);
		System.out.println("num: "+ num);
		
	}

}
