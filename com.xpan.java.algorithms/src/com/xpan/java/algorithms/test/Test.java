package com.xpan.java.algorithms.test;

import com.xpan.java.algorithms.wordscounter.WordsCounter;

public class Test {

	public static void main(String[] args) {
		try {
			WordsCounter counter = new WordsCounter();
			counter.printResult("/Users/xinpan/Desktop/temp/tmp.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
