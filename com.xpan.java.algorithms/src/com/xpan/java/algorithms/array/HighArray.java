package com.xpan.java.algorithms.array;

public class HighArray {

	private int[] arr;
	private int size;
	private int index;
	private int increasement;

	public HighArray(int increasement) {
		arr = new int[increasement];
		index = 0;
		size = 0;
		this.increasement = increasement;
	}

	public void insert(int element) {
		if (size > 0 && size % increasement == 0) {
			arr = allocate(arr, increasement);
		}
		arr[index] = element;
		index++;
		size++;

	}

	public boolean find(int element) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				return true;
			}
		}
		return false;
	}

	public boolean delete(int element) {
		int idx = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				idx = i;
				break;
			}
		}

		if (idx >= 0) {
			for (int i = idx; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			size--;
			arr[size] = 0;
			return true;
		}

		return false;

	}

	public int getMax() {
		if (size == 0) {
			return -1;
		}

		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public boolean removeMax() {
		if (size == 0) {
			return false;
		}

		int index = 0;
		int max = arr[index];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}

		if (index >= 0) {
			for (int i = index; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size - 1] = 0;
			size--;
			return true;
		}
		
		return false;

	}

	private int[] allocate(int[] oldArr, int increasement) {
		int[] newArr = new int[oldArr.length + increasement];
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}

	public int size() {
		return size;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

}
