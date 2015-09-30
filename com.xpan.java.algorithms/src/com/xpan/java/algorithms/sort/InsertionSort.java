package com.xpan.java.algorithms.sort;

public class InsertionSort {

	public static void sortWithCount(int[] arr) {
		int comparisons = 0;
		int copies = 0;
		for (int idx = 1; idx < arr.length; idx++) {
			int tmp = arr[idx];
			int j = idx - 1;
			while (j >= 0) {
				comparisons++;
				if (arr[j] > tmp) {
					arr[j + 1] = arr[j];
					j--;
					copies++;
				} else {
					break;
				}

			}
			arr[j + 1] = tmp;
			copies++;
		}

		System.out.println("Comparisons: " + comparisons);
		System.out.println("Copies: " + copies);

	}

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

	public static int[] sortWithoutDups(int[] arr) {
		int idx = 1;
		int dups = 0;
		while (idx < arr.length) {
			int tmp = arr[idx];
			int j = idx - 1;
			while (j >= dups) {
				if (arr[j] == Integer.MIN_VALUE) {
					arr[j + 1] = arr[j];
					j--;
				} else if (arr[j] > tmp) {
					arr[j + 1] = arr[j];
					j--;
				} else if (arr[j] == tmp) {
					arr[j + 1] = arr[j];
					arr[j] = Integer.MIN_VALUE;
					dups++;
					break;
				} else {
					break;
				}
			}
			arr[j + 1] = tmp;
			idx++;
		}

		int[] newArr = new int[arr.length - dups];
		int dup = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Integer.MIN_VALUE) {
				dup++;
			} else {
				newArr[i - dup] = arr[i];
			}
		}

		return newArr;
	}

}
