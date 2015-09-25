package com.xpan.java.algorithms.sort;

public class SortingUtil {

	public static int[] noDups(int[] arr) {
		int idx = 1;
		int leng = arr.length;
		int dup = 0;
		while (idx < leng) {
			if (arr[idx] == arr[idx - 1]) {
				dup++;
				idx++;
			} else {
				if (dup > 0) {
					for (int j = idx; j < leng; j++) {
						arr[j - dup] = arr[j];
					}
					leng = leng - dup;
					idx = idx - dup + 1;
					dup = 0;
				} else {
					idx++;
				}
			}

		}
		
		if (dup > 0) {
			for (int j = idx; j < leng; j++) {
				arr[j - dup] = arr[j];
			}
			leng = leng - dup;
		} 

		int[] newArr = new int[leng];
		for (int i = 0; i < leng; i++) {
			newArr[i] = arr[i];
		}

		arr = newArr;
		return arr;
	}

}
