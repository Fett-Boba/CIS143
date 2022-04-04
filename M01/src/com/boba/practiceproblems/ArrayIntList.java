package com.boba.practiceproblems;
public class ArrayIntList {

	private int []elementData;
	private int size;
	public static final int DEFAULT_CAPACITY = 10;
	
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);   // default # of elements is 10
	}
	
	public ArrayIntList(int capacity) {
		this.elementData = new int[capacity];
		this.size = 0;
	}
	
	//STUBS provided in lecture notes
	// public void add(int index) {  Shouldn't this be value instead of index ????
	public void add(int value) {
		elementData[size] = value;
		size++;
	}
	public void add(int index, int value) {

	}
	public void ensureCapacity(int capacity) {

	}
	public int get(int index) {
		return 1;
	}
	public int indexOf(int value) {
		return 1;
	}
	public void remove(int index) {

	}
	public void set(int index, int value) {

	}
	public int size() {
		return 1;
	}
	public String toString() {
		if (size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result = result + "," + elementData[i];
			}
			result = result + "]";
			return result;
		}
	}
	public void clear() {
		// no need to loop through and make all elements = 0... just reset the size.
		size = 0;
	}
	public void printInversions() {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (elementData[i] > elementData[j]) {
					System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
				} 
			}
		}
	}
	public ArrayIntList runningTotal() {
		ArrayIntList total = new ArrayIntList();
		if (size != 0) {
			total.add(elementData[0]);
			int sum = elementData[0];
			for (int i = 1; i < size; i++ ) {
				 sum = elementData[i] + sum;
				 total.add(sum);
			}
		} 
		return total;
	}
	public int max(int data[]) {
		
		
		
		return 1;
	}
	
}
