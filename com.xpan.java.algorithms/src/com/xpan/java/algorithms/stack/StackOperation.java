package com.xpan.java.algorithms.stack;

import java.util.Stack;

public class StackOperation {

	public int caculate(String[] arr) throws Exception {
		if (arr == null || arr.length == 0) {
			throw new Exception("array is null");
		}

		Stack stack = new Stack();
		for (String ch : arr) {
			if (isNumber(ch)) {
				int op = Integer.valueOf(ch);
				stack.push(op);
			} else {
				operate(stack, ch);
			}
		}

		return (int) stack.pop();
	}

	private boolean isNumber(String ch) {
		try {
			Integer.valueOf(ch);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private void operate(Stack stack, String op) {
		int res = 0;
		int a = (int) stack.pop();
		int b = (int) stack.pop();
		
		switch (op) {
		case "+":
			res = a + b;
			break;
		case "-":
			res = b - a;
			break;
		case "*":
			res = b * a;
			break;
		case "/":
			res = b / a;
			break;
		default:
		}

		stack.push(res);
	}

}
