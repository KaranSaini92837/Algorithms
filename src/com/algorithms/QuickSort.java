package com.algorithms;

public class QuickSort {

	public static void quickSort(int[] array) {

		quicksort(array, 0, array.length - 1);

	}

	public static void quicksort(int[] array, int left, int right) {

		if (left >= right) {
			return;
		}

		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);

	}

	private static int partition(int[] array, int left, int right, int pivot) {

		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				left++;
				right--;
			}
		}

		return left;
	}

	public static void main(String args[]) {

		int a[] = { 3, 4, 6, 7, 2, 8, 1 };
		quickSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

}
