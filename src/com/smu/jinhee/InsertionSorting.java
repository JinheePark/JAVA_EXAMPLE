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
			// compare�Լ��� ���ϰ� ���漳�� 1:���� ���ڰ� ū �� / 0: ���� �� / -1: �������ڰ� ū ��
			ints[currentSortedElement + 1] = ints[currentSortedElement];
			currentSortedElement--;
		}
		ints[currentSortedElement + 1] = extractedElement;
	}
}
