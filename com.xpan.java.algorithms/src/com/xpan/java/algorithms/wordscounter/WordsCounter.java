package com.xpan.java.algorithms.wordscounter;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounter {

	private static final String WORD_REGEX = "[\\w']+";

	public String loadFile(String fileLocation) throws Exception {
		byte[] encoded = Files.readAllBytes(Paths.get(fileLocation));
		return new String(encoded, StandardCharsets.UTF_8);
	}

	public Map<String, Integer> collect(String contents) {
		Pattern pattern = Pattern.compile(WORD_REGEX);
		Map<String, Integer> map = new HashMap<String, Integer>();
		Matcher matcher = pattern.matcher(contents);
		while (matcher.find()) {
			String word = contents.substring(matcher.start(), matcher.end());
			if (map.get(word) == null) {
				map.put(word, 1);
			} else {
				int count = map.get(word);
				count++;
				map.put(word, count);
			}

		}

		return map;
	}

	public WordCount[] sort(Map<String, Integer> wordMap) {
		WordCount[] array = new WordCount[wordMap.size()];
		int idx = 0;
		for (String word : wordMap.keySet()) {
			int count = wordMap.get(word);
			WordCount wordCount = new WordCount(word, count);
			array[idx] = wordCount;
			idx++;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getCount() > array[j].getCount()) {
					WordCount tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}

		return array;

	}

	public void printResult(String filePath) throws Exception {
		String contents = loadFile(filePath);
		WordCount[] array = sort(collect(contents));
		for (WordCount wc : array) {
			System.out.println(wc.getWord() + "-----" + wc.getCount());
		}

	}

	private class WordCount {

		private String word;
		private int count;

		WordCount(String word, int count) {
			this.word = word;
			this.count = count;
		}

		public String getWord() {
			return word;
		}

		public int getCount() {
			return count;
		}

	}

}
