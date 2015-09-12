package com.xpan.java.algorithms.array;

public class ArrayApp {

	public static void main(String[] args) {
//		HighArray ha = new HighArray(10);
		OrderedArray ha = new OrderedArray(10);
		
		ha.insert(6);
		ha.insert(1);
		ha.insert(8);
		ha.insert(7);
		ha.insert(10);
		ha.insert(3);
		ha.insert(2);
		
		ha.print();
		
		System.out.println("size() = " + ha.size());
		
		System.out.println("8 in arr? " + ha.find(8));
		System.out.println("15 in arr? " + ha.find(9));
		System.out.println("3 in arr? " + ha.find(3));
		
		System.out.println("delete 6? " + ha.delete(6));
		
		System.out.println("size() = " + ha.size());
		
		ha.print();
//		System.out.println("arr's size() " + ha.size());
//		
//		System.out.println("4 in arr? " + ha.find(4));
//		System.out.println("7 in arr? " + ha.find(7));
//		
//		ha.delete(2);
//		
//		ha.print();
//		System.out.println("arr's size() " + ha.size());
	}

}
