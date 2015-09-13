package com.xpan.java.algorithms.dataarray;

public class DataArray {

	private Person[] arr;
	private int size;
	private int index;
	private int increasement;

	public DataArray(int increasement) {
		arr = new Person[increasement];
		this.increasement = increasement;
		this.index = 0;
		this.size = 0;
	}

	public void insert(Person person) {
		if (size > 0 && size % increasement == 0) {
			arr = allocate(arr, increasement);
		}

		arr[index] = person;
		index++;
		size++;
	}

	public Person findByLasName(String lastName) {
		for (int i = 0; i < size; i++) {
			if (lastName.equals(arr[i].getLastName())) {
				return arr[i];
			}
		}
		return null;
	}

	public boolean delete(String lastName) {
		if (size <= 0) {
			return false;
		}

		int del = -1;
		for (int i = 0; i < size; i++) {
			if (lastName.equals(arr[i].getLastName())) {
				del = i;
				break;
			}
		}

		if (del > 0) {
			for (int i = del; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[size - 1] = null;
			size--;
			return true;
		}

		return false;
	}

	public int size() {
		return size;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			arr[i].display();
		}
	}

	private Person[] allocate(Person[] oldArr, int increasement) {
		Person[] newArr = new Person[oldArr.length + increasement];
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}

}
