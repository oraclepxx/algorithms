package com.xpan.java.algorithms.sort;

public class BubbleSort {

	private int[] arr;
	private int size;
	private int index;

	public BubbleSort(int capicity) {
		arr = new int[capicity];
		size = 0;
		index = 0;
	}

	public void insert(int element) throws Exception {
		if (size <= arr.length) {
			arr[index++] = element;
			size++;
		} else {
			throw new Exception("Array is full.");
		}
	}

	public void sort() {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
