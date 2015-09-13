package com.xpan.java.algorithms.dataarray;

public class DataArrayApp {

	public static void main(String[] args) {
		Person p1 = new Person("AA", "BB", 12);
		Person p2 = new Person("CC", "DD", 14);
		Person p3 = new Person("EE", "FF", 16);
		Person p4 = new Person("GG", "HH", 17);
		Person p5 = new Person("II", "JJ", 19);
		Person p6 = new Person("KK", "LL", 24);
		Person p7 = new Person("MM", "NN", 44);

		DataArray da = new DataArray(10);
		da.insert(p1);
		da.insert(p2);
		da.insert(p3);
		da.insert(p4);
		da.insert(p5);
		da.insert(p6);
		da.insert(p7);

//		da.print();
		System.out.println("size = " + da.size());

		System.out.println("finding JJ? " + da.findByLasName("JJ") != null);
		
		da.delete("JJ");
		da.print();

	}

}
