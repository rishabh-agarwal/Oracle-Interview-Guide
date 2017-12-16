package org.general;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

import java.util.HashSet;

import java.util.Iterator;

public class ListElements {

	public static void main(String[] args) {

		try {

			ArrayList<Integer> tempList = new ArrayList<Integer>();

			tempList.add(81);

			tempList.add(33);

			tempList.add(7);

			tempList.add(132);

			tempList.add(5);

			tempList.add(17);

			tempList.add(99);

			tempList.add(104);

			tempList.add(399);

			tempList.add(72);

			tempList.add(86);

			tempList.add(105);

			System.out.println("The max from this list is:" + getMaxFromList(tempList));

			System.out.println("The mode from this list is:" + getModeFromList(tempList));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static Integer getMaxFromList(ArrayList<Integer> inputList) {

		return Collections.max(inputList);

	}

	public static Integer getModeFromList(ArrayList<Integer> inputList) {

		// I used HashMap because this is O(n) complexity if we use HashSet then it'll
		// be O(n^2) complexity

		HashMap map = new HashMap();

		int maxCount = 1; // at least one occurence will be there

		int mode = inputList.get(0); // let us assume the first element to be mode

		for (int i = 0; i < inputList.size(); i++)

		{

			int value = inputList.get(i);

			if (map.containsKey(value)) {

				int count = (Integer) map.get(value);

				count++;

				map.put(value, count);

				if (count >= maxCount)

				{

					mode = value;

					maxCount = count;

				}

			}

			else {

				map.put(inputList.get(i), 1);

			}

		}

		return mode;

	}

	// Assuming if there is no duplicate it will return the first index

}