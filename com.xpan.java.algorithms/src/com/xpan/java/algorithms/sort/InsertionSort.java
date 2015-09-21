package com.xpan.java.algorithms.sort;

public class InsertionSort {

	public static void sort(int[] arr) {
		for (int idx = 1; idx < arr.length; idx++) {
			int tmp = arr[idx];
			int j = idx - 1;
			while (j >= 0 && arr[j] > tmp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tmp;
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
