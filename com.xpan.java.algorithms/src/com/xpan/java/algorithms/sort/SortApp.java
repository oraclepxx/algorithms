package com.xpan.java.algorithms.sort;

public class SortApp {

	public static void main(String[] args) {
		test3();
	}

	public static void test3() {
		int[] arr = { 6, 6, 5, 5, 5, 0, 0, 2, 2, 2, 2, 2, 8, 3, 3, 1, 9, 4, 4, 7 };
		InsertionSort.sortNoDups(arr);
		print(arr);
	}

	public static void test2() {
		int[] arr = { 0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 3, 3, 4, 4, 7, 9, 9, 9 };
		arr = SortingUtil.noDups(arr);
		print(arr);
		System.out.println("size=" + arr.length);
	}

	public static void test1() {
		int[] arr = generateArray(100000);

		long start = System.currentTimeMillis();
		// BubbleSort.sort(arr);
		// SelectionSort.sort(arr);
		InsertionSort.sort(arr);
		long end = System.currentTimeMillis();
		print(arr);
		// System.out.println("Bubble Sorting takes " + (end-start) + "ms");
		// System.out.println("Selection Sorting takes " + (end-start) + "ms");
		System.out.println("Insertion Sorting takes " + (end - start) + "ms");
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] generateArray(int maxLength) {
		int[] arr = new int[maxLength];
		for (int i = 0; i < maxLength; i++) {
			int random = (int) (Math.random() * maxLength);
			arr[i] = random;
		}

		return arr;
	}
}
