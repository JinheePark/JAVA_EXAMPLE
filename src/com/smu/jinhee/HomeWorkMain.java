package com.smu.jinhee;

import java.util.Comparator;
import java.util.Scanner;

public class HomeWorkMain {
	public static Scanner scan = new Scanner(System.in);
	private static final int SORT_INTEGERS = 1;
	private static final int SELECT_A_SORTING_ALGORITHM = 2;
	private static final int SELECT_A_SORTING_ORDER = 3;
	private static final int QUIT = 4;
	private static final int BUBBLE_SORT = 1;
	private static final int INSERTION_SORT = 2;
	private static final int SELECTION_SORT = 3;
	private static final int QUICK_SORT = 4;
	private static final int ASCENDING = 1;
	private static final int DESCENDING = 2;
	private int selectedSortingAlgorithm = BUBBLE_SORT;
	private int selectedSortingOrder = ASCENDING;
	private Sorter sorter;
	private Comparator<Integer> comparator;

	public static void main(String[] args) {
		HomeWorkMain homeworkmain = new HomeWorkMain();
		homeworkmain.displayInitialScreen();
	}

	private void displayInitialScreen() {
		int selectedMenuNumber = 0;
		while (selectedMenuNumber != QUIT) {
			System.out.println("[ ID: 1216634 ]");
			System.out.println("[ Name: Park Jinhee ]\n");
			System.out.println("1. Sort integers");
			System.out.println("2. Select a sorting algorithm");
			System.out.println("3. Select a sorting order");
			System.out.println("4. Quit");
			selectedMenuNumber = scan.nextInt();
			selectMenu(selectedMenuNumber);
		}
	}

	private void selectMenu(int selectedMenuNumber) {
		switch (selectedMenuNumber) {
		case SORT_INTEGERS:
			sortIntegers();
			break;
		case SELECT_A_SORTING_ALGORITHM:
			selectSortingtAlgorithm();
			break;
		case SELECT_A_SORTING_ORDER:
			selectSortingOrder();
			break;
		case QUIT:
			System.exit(0);
			break;
		}
	}

	private void sortIntegers() {
		setSortingOrder();
		switch (selectedSortingAlgorithm) {
		case BUBBLE_SORT:
			sorter = new BubbleSorting();
			break;
		case INSERTION_SORT:
			sorter = new InsertionSorting();
			break;
		case SELECTION_SORT:
			sorter = new SelectionSorting();
			break;
		case QUICK_SORT:
			sorter = new QuickSorting();
			break;
		}
		sortIntegers(sorter, comparator);
	}

	private void setSortingOrder() {
		if (selectedSortingOrder == DESCENDING) {
			comparator = new DescendingComparator();
		} else {
			comparator = new AscendingComparator();
		}
	}

	private void sortIntegers(Sorter sorter, Comparator<Integer> comparator) {
		this.sorter = sorter;
		this.comparator = comparator;
		sorter.setNumberOfIntegers();
		sorter.setIntegers();
		int[] result = sorter.doSorting(sorter.getIntegers(), comparator);
		printSortResult(result);
	}

	private void selectSortingtAlgorithm() {
		System.out.println("\n>Select a sorting algorithm\n");
		System.out.println("1. Buuble sort");
		System.out.println("2. Insertion sort");
		System.out.println("3. Selection sort");
		System.out.println("4. Quick sort\n");
		selectedSortingAlgorithm = scan.nextInt();
	}

	private void selectSortingOrder() {
		System.out.println("\n>Selection a sorting order");
		System.out.println("\n1. Ascending order");
		System.out.println("2. Descending order");
		selectedSortingOrder = scan.nextInt();
	}

	public void printSortResult(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("\n\n\n\n");
	}
}