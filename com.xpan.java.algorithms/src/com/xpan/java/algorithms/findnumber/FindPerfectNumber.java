package com.xpan.java.algorithms.findnumber;

import java.util.ArrayList;
import java.util.List;

public class FindPerfectNumber {

	public static void main(String[] args) {
		List<Integer> list = findPerfectNumber(10000);
		for (Integer num : list) {
			System.out.println(num);
		}
	}

	public static List<Integer> findPerfectNumber(int totalNum) {
		List<Integer> allPerfects = new ArrayList<Integer>();
		int currentNum = 1;
		while (currentNum <= totalNum) {
			List<Integer> tList = new ArrayList<Integer>();
			tList.add(1);
			tList.add(currentNum);

			for (int i = 1; i < currentNum; i++) {
				if (currentNum % i == 0) {
					if (!tList.contains(i)) {
						tList.add(i);
					}
				}
			}

			if (checkAddition(currentNum, tList) && checkMultiplication(currentNum, tList) && checkDivision(currentNum, tList)) {
				allPerfects.add(currentNum);
			}

			currentNum++;
		}

		return allPerfects;
	}

	public static boolean checkAddition(int number, List<Integer> nList) {
		int sum = 0;
		for (Integer curNum : nList) {
			if (curNum == number) {
				continue;
			}
			sum = sum + curNum;
		}

		return sum == number;
	}

	public static boolean checkMultiplication(int number, List<Integer> nList) {
		int sum = 1;
		for (Integer curNum : nList) {
			if (curNum == number) {
				continue;
			}
			sum = sum * curNum;
		}

		return sum == number;
	}

	public static boolean checkDivision(int number, List<Integer> nList) {
		int sum = 0;
		for (Integer curNum : nList) {
			sum = sum + curNum;
		}

		return sum / 2 == number;
	}
}
