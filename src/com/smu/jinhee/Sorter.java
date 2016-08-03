package com.smu.jinhee;

import java.util.Comparator;
import java.util.Scanner;

public abstract class Sorter {
	public static Scanner scan = new Scanner(System.in);
	protected static int numberOfIntegers;
	protected static int[] integers;
	protected static int lastElement;

	public void setNumberOfIntegers() {
		System.out.println("The number of integers: ");
		numberOfIntegers = scan.nextInt();
		integers = new int[numberOfIntegers];
		lastElement = integers.length;
	}

	public void setIntegers() {
		System.out.println("Integers:");
		for (int i = 0; i < numberOfIntegers; i++) {
			integers[i] = scan.nextInt();
		}
	}

	public int[] getIntegers() {
		return integers;
	}

	public abstract int[] doSorting(int[] integers, Comparator<Integer> comparator);

	protected static void swapElements(int[] integers, int leftElement, int rightElement) {
		int temp = integers[leftElement];
		integers[leftElement] = integers[rightElement];
		integers[rightElement] = temp;
	}

}
