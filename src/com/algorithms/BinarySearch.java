package com.algorithms;

public class BinarySearch {

	public static int binarySearch(int a[], int number) {

		int low = 0;
		int high = a.length - 1;

		return binarySearch(a, low, high, number);

	}

	private static int binarySearch(int[] a, int low, int high, int number) {

		int mid = low + ((high - low) / 2);

		if (high >= low) {
			if (a[mid] == number) {
				return mid;
			} else if (number > a[mid]) {
				return binarySearch(a, mid + 1, high, number);
			} else if (number < a[mid]) {
				return binarySearch(a, low, mid - 1, number);
			} else
				return -1;
		}

		return -1;

	}

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10 };

		System.out.println(binarySearch(a, 7));

	}

}
