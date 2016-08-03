package com.smu.jinhee;

import java.util.Comparator;

public class SelectionSorting extends Sorter {
	public int[] doSorting(int[] integers, Comparator<Integer> comparator) {
		int[] ints = integers;
		int leftElement = 0, rightElement, indexOfMin;
		for (int i = 0; i < lastElement - 1; i++) {
			indexOfMin = i;
			for (int j = i + 1; j < lastElement; j++) {
				leftElement = i;
				rightElement = j;
				if (comparator.compare(ints[rightElement], ints[indexOfMin]) < 0)
					// compare함수의 리턴값 보충설명 1:앞의 인자가 큰 값 / 0: 같은 값 / -1: 뒤의인자가 큰
					// 값
					indexOfMin = j;
			}
			swapElements(ints, indexOfMin, leftElement);
		}
		return ints;
	}
}
