package com.xpan.java.algorithms.array;

public class OrderedArray {

	private int[] orderedArr;
	private int size;
	private int increasement;

	public OrderedArray(int increasement) {
		orderedArr = new int[increasement];
		this.increasement = increasement;
		size = 0;
	}

	public void insert(int element) {
		if (size > 0 && size % increasement == 0) {
			orderedArr = allocate(orderedArr, increasement);
		}

		if (size > 0) {
			boolean done = false;
			for (int i = 0; i < size; i++) {
				if (element >= orderedArr[i]) {
					continue;
				} else {
					for (int j = size - 1; j >= i; j--) {
						orderedArr[j + 1] = orderedArr[j];
					}
					orderedArr[i] = element;
					size++;
					done = true;
					break;
				}

			}
			if (!done) {
				orderedArr[size++] = element;
			}
		} else {
			orderedArr[size] = element;
			size++;
		}
	}

	public void binaryInsert(int element) {
		if (size > 0 && size % increasement == 0) {
			orderedArr = allocate(orderedArr, increasement);
		}

		int index = caculateIndex(element);
		for (int i = size - 1; i >= index; i--) {
			orderedArr[i + 1] = orderedArr[i];
		}
		orderedArr[index] = element;
		size++;
	}

	public int caculateIndex(int element) {
		int index = 0;
		if (size == 0) {
			return index;
		}
		int low = 0;
		int high = size - 1;
		int point = (low + high) / 2;
		while (low <= high) {
			if (element >= orderedArr[point]) {
				low = point + 1;
			} else if (element < orderedArr[point]) {
				high = point - 1;
			} 

			point = (low + high) / 2;
			index = point + 1;
		}

		return index;
	}

	public int find(int element) {
		int index = -1;
		if (size <= 0 || element > orderedArr[size - 1] || element < orderedArr[0]) {
			return index;
		}

		int low = 0;
		int high = size - 1;
		int point = (low + high) / 2;
		while (low <= high) {
			if (element > orderedArr[point]) {
				low = point + 1;
			} else if (element < orderedArr[point]) {
				high = point - 1;
			} else {
				index = point;
				break;
			}

			point = (low + high) / 2;
		}

		return index;
	}

	public boolean delete(int element) {
		int index = find(element);
		if (index > -1) {
			for (int i = index; i < size - 1; i++) {
				orderedArr[i] = orderedArr[i + 1];
			}
			orderedArr[size - 1] = 0;
			size--;
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}
	
	public int[] merge(int[] target) {
		OrderedArray newArr = new OrderedArray(size + target.length);
		
		for(int i = 0; i < size; i++) {
			newArr.insert(orderedArr[i]);
		}
		
		for(int i = 0; i < target.length; i++) {
			newArr.insert(target[i]);
		}
		
		return newArr.orderedArr;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(orderedArr[i]);
		}
	}

	private int[] allocate(int[] oldArr, int increasement) {
		int[] newArr = new int[oldArr.length + increasement];
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}

}
