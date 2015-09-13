package com.xpan.java.algorithms.array;

public class ArrayApp {

	public static void main(String[] args) {
//		HighArray ha = new HighArray(10);
		OrderedArray ha = new OrderedArray(10);
		
		ha.binaryInsert(6);
		ha.binaryInsert(1);
		ha.binaryInsert(8);
		ha.binaryInsert(7);
		ha.binaryInsert(10);
		ha.binaryInsert(3);
		ha.binaryInsert(2);
		
		ha.print();
	}

}
