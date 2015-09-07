package com.xpan.java.algorithms.duplicatenum;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public void duplicateCharacter(String contents) {
		Map<String, Integer> tMap = new HashMap<String, Integer>();
		for (int idx = 0; idx < contents.length(); idx++) {
			String cur = String.valueOf(contents.charAt(idx));
			if (tMap.get(cur) == null) {
				tMap.put(cur, 1);
			} else {
				int total = tMap.get(cur);
				total++;
				tMap.put(cur, total);
			}
		}

		for (String ch : tMap.keySet()) {
			System.out.println("Character: " + ch + ", repeation: " + tMap.get(ch));
		}

	}
}
