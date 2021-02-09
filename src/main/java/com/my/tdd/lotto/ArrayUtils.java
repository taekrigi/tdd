package com.my.tdd.lotto;

import java.util.Arrays;

public class ArrayUtils<T> {

	private T[] array;
	
	public ArrayUtils(T[] array) {
		this.array = array;
	}
	
	public boolean contains(T element) {
		for (int i = 0; i < array.length; i++) {
			if (element.equals(array[i])) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
}
