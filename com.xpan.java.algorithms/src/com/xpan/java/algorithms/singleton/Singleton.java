package com.xpan.java.algorithms.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	// public Singleton getInstance() {
	// if (instance == null) {
	// return new Singleton();
	// }
	// return instance;
	// }

	public Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
