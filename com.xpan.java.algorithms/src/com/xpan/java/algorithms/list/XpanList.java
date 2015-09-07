package com.xpan.java.algorithms.list;

import java.util.Arrays;

public class XpanList {

	private static int INCREASEMENT = 10;

	private Object[] elements;

	private int size = 0;

	public XpanList() {
		elements = new Object[INCREASEMENT];
	}

	public int size() {
		return size;
	}

	public void add(Object element) {
		if (element == null || elements == null) {
			return;
		}

		if (size > 0 && (size % INCREASEMENT == 0)) {
			elements = Arrays.copyOf(elements, elements.length + INCREASEMENT);
		}

		elements[size] = element;
		size++;

	}

	public void remove(Object element) {
		if (contains(element)) {
			for (int i = 0; i < size; i++) {
				if (elements[i].equals(element)) {
					for (int j = i + 1; j < size; j++) {
						elements[i] = elements[j];
						i = j;
					}

					break;
				}
			}

			elements[size - 1] = null;
			size--;
		}
	}

	public void remove(int index) {
		if (index < 0 || index > size) {
			return;
		}

		for (int i = 0; i < size; i++) {
			if (i == index) {
				for (int j = i + 1; j < size; j++) {
					elements[i] = elements[j];
					i = j;
				}

				break;
			}
		}

		elements[size - 1] = null;
		size--;
	}

	public Object get(int index) {
		if (index < 0 || index > size) {
			return null;
		}

		return elements[index];
	}

	public boolean contains(Object element) {
		if (elements == null || element == null) {
			return false;
		}

		for (int i = 0; i < size; i++) {
			if (elements[i].equals(element)) {
				return true;
			}
		}

		return false;
	}

}
