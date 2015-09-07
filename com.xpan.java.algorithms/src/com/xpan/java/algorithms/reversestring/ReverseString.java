package com.xpan.java.algorithms.reversestring;

public class ReverseString {

	private static final String template = "Helloworld, this is java.";

	public static String reverse(String string) throws Exception {
		if (string == null || string.isEmpty()) {
			throw new Exception("Error");
		}

		if (string.length() <= 1) {
			return string;
		}

		String last = string.substring(string.length() - 1);
		String left = string.substring(0, string.length() - 1);
		return last + reverse(left);
	}

	public static void main(String[] args) {
		try {
			System.out.println(reverse(template));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
