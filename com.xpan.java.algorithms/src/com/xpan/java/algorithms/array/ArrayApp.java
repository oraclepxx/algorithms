package com.xpan.java.algorithms.array;

public class ArrayApp {

	public static void main(String[] args) {
		 HighArray ha = new HighArray(10);

		ha.insert(1);
		ha.insert(2);
		ha.insert(3);
		ha.insert(2);
		ha.insert(5);
		ha.insert(7);
		ha.insert(9);
		ha.insert(2);
		ha.insert(6);
		ha.insert(1);
		ha.insert(8);

		ha.print();
		System.out.println("size = " + ha.size());
		
		ha.noDups();
		
		System.out.println("*************");
		ha.print();
		System.out.println("size = " + ha.size());
	}

}
