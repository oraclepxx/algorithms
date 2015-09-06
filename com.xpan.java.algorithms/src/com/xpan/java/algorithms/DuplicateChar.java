package com.xpan.java.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateChar {

	public boolean hasDuplicateCharacter(String contents) {
		boolean find = false;
		List<String> tList = new ArrayList<String>();
		for (int idx = 0; idx < contents.length(); idx++) {
			char ch = contents.charAt(idx);
			if (tList.contains(ch)) {
				find = true;
				break;
			} else {
				tList.add(String.valueOf(ch));
			}
		}

		return find;
	}
}
