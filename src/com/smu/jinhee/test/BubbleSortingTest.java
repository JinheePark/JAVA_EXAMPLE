package com.smu.jinhee.test;

import static org.junit.Assert.*;
import java.util.Comparator;
import org.junit.Test;
import com.smu.jinhee.AscendingComparator;
import com.smu.jinhee.BubbleSorting;
import com.smu.jinhee.DescendingComparator;
import com.smu.jinhee.Sorter;

public class BubbleSortingTest {
	Sorter sorter;
	Comparator<Integer> comparator;
	int[] testIntegers = {35, 23, 12, 2, 1};
	int[] expectedAscendingIntegers = {1, 2, 12, 23, 35};
	int[] expectedDescendingIntegers = {35, 23, 12, 2, 1};
	int[] testDuplicateIntegers = {35, 35, 35, 2, 1};
	int[] expectedAscendingDuplicateIntegers = {1, 2, 35, 35, 35};
	int[] expectedDescendingDuplicateIntegers = {35, 35, 35, 2, 1};
	
	@Test
	public void testDoSortingWithAscendingOrder() {
		sorter = new BubbleSorting();
		comparator = new AscendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		assertArrayEquals(expectedAscendingIntegers, resultIntegers);
	}

	@Test
	public void testDoSortingWithDescendingOrder() {
		sorter = new BubbleSorting();
		comparator = new DescendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		assertArrayEquals(expectedDescendingIntegers, resultIntegers);
	}
	
	@Test
	public void testDoSortingWithAscendingOrder_DuplicateInteger() {
		sorter = new BubbleSorting();
		comparator = new AscendingComparator();
		int[] resultIntegers = sorter.doSorting(testDuplicateIntegers, comparator);
		assertArrayEquals(expectedAscendingDuplicateIntegers, resultIntegers);
	}
	
	@Test
	public void testDoSortingWithDescendingOrder_DuplicateInteger() {
		sorter = new BubbleSorting();
		comparator = new DescendingComparator();
		int[] resultIntegers = sorter.doSorting(testDuplicateIntegers, comparator);
		assertArrayEquals(expectedDescendingDuplicateIntegers, resultIntegers);
	}
}
