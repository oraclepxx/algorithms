package com.xpan.java.algorithms.sort;

public class InsertionSort {

	public static void sort(int[] arr) {
		for (int idx = 1; idx < arr.length; idx++) {
			int tmp = arr[idx];
			for (int j = idx - 1; j >= 0; j--) {
				if (tmp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					arr[j] = tmp;
					break;
				}
			}

		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
