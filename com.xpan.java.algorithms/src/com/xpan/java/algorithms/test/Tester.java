package com.xpan.java.algorithms.test;

import com.xpan.java.algorithms.RotateArray;

public class Tester {

	public static void main(String[] args) throws Exception {
		// String contents =
		// "Write a program to find out duplicate or repeated characters in a string, and calculate the count of repeatation.";
		// DuplicateChar dc = new DuplicateChar();
		// dc.duplicateCharacter(contents);

		String[] arr = { "1", "2", "3", "4", "5", "6", "7"};
		RotateArray ra = new RotateArray();
		ra.printArray(arr);
//		String[] arr2 = ra.rotateArray(arr);
		String[] arr3 = ra.rotate(arr, 3);
//		ra.printArray(arr2);
		ra.printArray(arr3);

	}

}
