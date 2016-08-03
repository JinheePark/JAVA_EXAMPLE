package com.smu.jinhee.test;

import static org.junit.Assert.*;
import java.util.Comparator;
import org.junit.Test;
import com.smu.jinhee.AscendingComparator;
import com.smu.jinhee.DescendingComparator;
import com.smu.jinhee.InsertionSorting;
import com.smu.jinhee.Sorter;

public class InsertionSortingTest {
	Sorter sorter;
	Comparator<Integer> comparator;
	int[] testIntegers = {35, 23, 12, 2, 100};
	int[] expectedAscendingIntegers = {2, 12, 23, 35, 100};
	int[] expectedDescendingIntegers = {100, 35, 23, 12, 2};
	int[] testDuplicateIntegers = {35, 35, 35, 2, 100};
	int[] expectedAscendingDuplicateIntegers = {2, 35, 35, 35, 100};
	int[] expectedDescendingDuplicateIntegers = {100, 35, 35, 35, 2};
	
	@Test
	public void testDoSortingWithAscendingOrder() {
		sorter = new InsertionSorting();
		comparator = new AscendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		assertArrayEquals(expectedAscendingIntegers, resultIntegers);
	}

	@Test
	public void testDoSortingWithDescendingOrder() {
		sorter = new InsertionSorting();
		comparator = new DescendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		System.out.println("2)100, 35, 23, 12, 2 / " + resultIntegers[0] +","+ resultIntegers[1]+","+resultIntegers[2]+","+resultIntegers[3]+","+resultIntegers[4]);
		assertArrayEquals(expectedDescendingIntegers, resultIntegers);
	}
	
	@Test
	public void testDoSortingWithAscendingOrder_DuplicateInteger() {
		sorter = new InsertionSorting();
		comparator = new AscendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		assertArrayEquals(expectedAscendingDuplicateIntegers, resultIntegers);
	}
	
	@Test
	public void testDoSortingWithDescendingOrder_DuplicateInteger() {
		sorter = new InsertionSorting();
		comparator = new DescendingComparator();
		int[] resultIntegers = sorter.doSorting(testIntegers, comparator);
		assertArrayEquals(expectedDescendingDuplicateIntegers, resultIntegers);
	}
}
