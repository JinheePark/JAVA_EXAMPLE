package com.smu.jinhee;

import java.util.Comparator;

public class QuickSorting extends Sorter {
	public int[] doSorting(int[] integers, Comparator<Integer> comparator) {
		int[] ints = integers;
		int lowIndex = 0;
		int highIndex = lastElement - 1;
		QuickSort(ints, lowIndex, highIndex, comparator);
		return ints;
	}

	private static void QuickSort(int[] ints, int leftElement, int rightElement, Comparator<Integer> comparator) {
		if (leftElement < rightElement) {
			int pivotIndex = partition(ints, leftElement, rightElement, comparator);
			QuickSort(ints, leftElement, pivotIndex - 1, comparator);
			QuickSort(ints, pivotIndex + 1, rightElement, comparator);
		}
	}

	private static int partition(int[] ints, int leftElement, int rightElement, Comparator<Integer> comparator) {
		int pivot = rightElement;
		while (leftElement < rightElement) {
			while ((comparator.compare(ints[leftElement], ints[pivot]) <= 0) && leftElement < rightElement)
				leftElement++;
			while ((comparator.compare(ints[rightElement], ints[pivot]) >= 0) && leftElement > rightElement)
				rightElement--;
			// compare함수의 리턴값 보충설명 1:앞의 인자가 큰 값 / 0: 같은 값 / -1: 뒤의인자가 큰 값
			if (leftElement < rightElement) {
				swapElements(ints, leftElement, rightElement);
			}
		}
		return leftElement;
	}
}
