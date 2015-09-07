package com.xpan.java.algorithms.decimal2binary;

public class Decimal2Binary {

	private static final int deci = 456;

	public static String decimal2Binary(int decimalValue) {
		String binary = "";

		while (decimalValue != 0) {
			int mod = decimalValue % 2;
			binary = String.valueOf(mod) + binary;
			decimalValue = decimalValue / 2;
		}

		return binary;
	}

	public static void main(String[] args) {
		System.out.println(decimal2Binary(deci));
	}

}
