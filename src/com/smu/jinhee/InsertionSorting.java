package com.smu.jinhee;

import java.util.Comparator;

public class InsertionSorting extends Sorter {
	public int[] doSorting(int[] integers, Comparator<Integer> comparator) {
		int[] ints = integers;
		int extractedElement, currentSortedElement;
		for (int i = 0; i < lastElement; i++) {
			extractedElement = ints[i];
			currentSortedElement = i - 1;
			moveElementTotheRightBy1(ints, extractedElement, currentSortedElement, comparator);
		}
		return ints;
	}

	private void moveElementTotheRightBy1(int[] ints, int extractedElement, int currentSortedElement,
			Comparator<Integer> comparator) {
		while (currentSortedElement >= 0 && comparator.compare(extractedElement, ints[currentSortedElement]) < 0) {
			// compare함수의 리턴값 보충설명 1:앞의 인자가 큰 값 / 0: 같은 값 / -1: 뒤의인자가 큰 값
			ints[currentSortedElement + 1] = ints[currentSortedElement];
			currentSortedElement--;
		}
		ints[currentSortedElement + 1] = extractedElement;
	}
}
