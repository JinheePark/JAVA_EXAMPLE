package com.smu.jinhee;

import java.util.Comparator;

public class BubbleSorting extends Sorter {
	public int[] doSorting(int[] integers, Comparator<Integer> comparator) {
		int[] ints = integers;
		int leftElement, rightElement, indexOfLastUnsortedElement;
		for (int i = 0; i < lastElement - 1; i++) {
			indexOfLastUnsortedElement = lastElement - 1 - i;
			for (int j = 0; j < indexOfLastUnsortedElement; j++) {
				leftElement = j;
				rightElement = j + 1;
				if (comparator.compare(ints[leftElement], ints[rightElement]) > 0) {
					// compare�Լ��� ���ϰ� ���漳�� 1:���� ���ڰ� ū �� / 0: ���� �� / -1: �������ڰ� ū
					// ��
					swapElements(ints, leftElement, rightElement);
				}
			}
		}
		return ints;
	}
}
