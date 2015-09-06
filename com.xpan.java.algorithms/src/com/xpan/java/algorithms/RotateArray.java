package com.xpan.java.algorithms;

public class RotateArray {

	public String[] rotateArray(String[] arr) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new Exception("Array is null.");
		}

		int len = arr.length / 2;
		for (int idx = 0; idx < len; idx++) {
			String tmp = arr[idx];
			arr[idx] = arr[arr.length - 1 - idx];
			arr[arr.length - 1 - idx] = tmp;
		}

		return arr;

	}

	public String[] rotateArray(String[] arr, int k) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new Exception("Array is null");
		}

		for (int i = 0; i < k; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				String tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tmp;
			}
		}

		return arr;
	}

	public String[] rotate(String[] arr, int k) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new Exception("Array is null");
		}

		for (int i = 0; i < k; i++) {
			for (int j = k + i + 1; j > i; j--) {
				String tmp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = tmp;
			}
			
		}

		return arr;
	}

	public void printArray(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
