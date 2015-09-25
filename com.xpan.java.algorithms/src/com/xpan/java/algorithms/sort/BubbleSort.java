package com.xpan.java.algorithms.sort;

public class BubbleSort {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void bidirectionSort(int[] arr) {
		int i = 0;
		int j = 0;
		for (int k = 0; k < arr.length / 2; k++) {
			i = j + k;
			while (i < arr.length - 1 - k) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
				i++;
			}

			j = i - k - 1;
			while (j > 0) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
				j--;
			}
		}
	}

}
