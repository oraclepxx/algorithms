package com.xpan.java.algorithms.sort;

public class SelectionSort {

	public static void sort(int[] arr) {
		int swap = 0;
		int comparison = 0;
		for (int i = 0; i < arr.length; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				comparison++;
				if (arr[idx] > arr[j]) {
					idx = j;
				}
			}
			if (i != idx) {
				swap++;
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}
		}

		System.out.println("swap: " + swap);
		System.out.println("comparison: " + comparison);
	}

}
