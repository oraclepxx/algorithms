package com.xpan.java.algorithms.sort;

public class SortApp {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 0, 2, 8, 3, 1, 7, 4, 9 };
		InsertionSort.print(arr);
		InsertionSort.sort(arr);
		System.out.println("*********");
		InsertionSort.print(arr);
	}
}
