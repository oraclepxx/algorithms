package com.xpan.java.algorithms.middleindex;

import java.util.ArrayList;
import java.util.List;

public class MiddleIndex {

	private final static int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static int getMiddleIndex(int[] arrays) throws Exception {
		if (arrays == null || arrays.length == 0) {
			throw new Exception("Array is empty");
		}

		List<Integer> indexs = new ArrayList<Integer>();
		int index = arrays.length / 2;
		indexs.add(index);

		int leftEnd = getSum(arrays, 0, index);
		int rightEnd = getSum(arrays, index + 1, arrays.length - 1);

		while (leftEnd != rightEnd) {
			if (checkIndex(indexs)) {
				throw new Exception("No middle index in this array");
			}
			if (leftEnd > rightEnd) {
				index--;
			} else {
				index++;
			}
			indexs.add(index);
			leftEnd = getSum(arrays, 0, index);
			rightEnd = getSum(arrays, index + 1, arrays.length - 1);
		}

		return index;
	}

	private static boolean checkIndex(List<Integer> indexList) {
		boolean find = false;
		if (indexList != null && indexList.size() > 1) {
			boolean duplicate = false;
			for (int i = 0; i < indexList.size(); i++) {
				int indexValue = indexList.get(i);
				for (int j = i + 1; j < indexList.size(); j++) {
					if (indexValue == indexList.get(j)) {
						duplicate = true;
						break;
					}
				}
				if (duplicate) {
					find = true;
					break;
				}
			}
		}

		return find;
	}

	private static int getSum(int[] arrays, int begin, int end) throws Exception {
		int sum = 0;
		if (begin > end) {
			throw new Exception("Begin should be smaller than end.");
		}

		while (begin <= end) {
			sum = sum + arrays[begin++];
		}

		return sum;

	}

	public static void main(String[] args) {
		try {
			int index = getMiddleIndex(numbers);
			System.out.println("Middle Index: " + index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
