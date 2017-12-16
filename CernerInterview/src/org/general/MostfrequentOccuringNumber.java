/*
 * @author: Rishabh Agarwal
 * 
 * Find the mode or most occuring element in a list, also find the max
 * 
 */

package org.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostfrequentOccuringNumber {

	public static void findMax(List<Integer> inputList) {
		int max = Collections.max(inputList);
		System.out.println(max);
	}
	
	public static void findMode(List<Integer> list) {
		
		int mode ,maxCount=1 ,tempCount=0, maxCountNum=0;
		
		System.out.println("Mode finding begins..");
		
		for(int curr = 0; curr<list.size() ; curr++)
		{
			tempCount =0;
			
			for(int comp = 0; comp<list.size(); comp++) {
				int t1 = list.get(curr);
				int t2 = list.get(comp);
				
				if(t1 == t2) {
					tempCount ++;
					if(tempCount > maxCount) {
					maxCountNum = list.get(curr);
					maxCount = tempCount;
					}
				}
			}
		}
		
		if(maxCount ==1 ) {
			System.out.println("No Mode max freq is 1");
		}
		else {
			System.out.println("Number is "+ maxCountNum + " Freq :" + maxCount);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(333);
		list.add(9);
		list.add(1);
		list.add(12);
		list.add(1);
		list.add(8);
		list.add(1);
		list.add(47);
		list.add(59);
		list.add(91);
		list.add(32);
		list.add(1);
		list.add(1);
		list.add(1);
		
		findMax(list);		
		findMode(list);
	}
}
