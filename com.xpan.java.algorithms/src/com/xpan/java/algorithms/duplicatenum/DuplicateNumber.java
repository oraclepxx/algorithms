package com.xpan.java.algorithms.duplicatenum;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	private final static int[] numbers = {2, 3, 4, 5, 6, 7, 7, 8, 9, 10 };

	public static int findOutDuplicateNumber(List<Integer> numberList) throws Exception {
		int duplicated = Integer.MAX_VALUE;
		boolean found = false;

		if (numberList == null || numberList.isEmpty()) {
			throw new Exception("List is empty.");
		}

		for (int i = 0; i < numberList.size(); i++) {
			duplicated = numberList.get(i);
			for (int idx = i + 1; idx < numberList.size(); idx++) {
				if (duplicated == numberList.get(idx)) {
					found = true;
					break;
				}
			}

			if (found) {
				break;
			}
		}

		return duplicated;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List toList(int[] arrays) {
		List list = new ArrayList();
		int idx = 0;
		while (idx < arrays.length) {
			list.add(arrays[idx++]);
		}
		return list;
	}

	private static int getSum(List<Integer> numberList) {
		int sum = 0;
		for (Integer num : numberList) {
			sum = sum + num;
		}

		return sum;
	}

	public static int findOutDuplicateNumber2(List<Integer> numberList) throws Exception {
		if (numberList == null || numberList.isEmpty()) {
			throw new Exception("List is empty.");
		}

		int low = numberList.get(0);
		int high = numberList.get(numberList.size() - 1);
		int temp = ((low + high) * high) / 2;
		int total = getSum(numberList);

		return total - temp;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		List numberList = toList(numbers);
		int duplicated = findOutDuplicateNumber2(numberList);
		System.out.println("Duplicated number: " + duplicated);
	}

}
