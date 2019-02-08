package com.algorithms;

public class MergeSortAlgo {

	public static void mergeSort(Comparable arr[]) {
		Comparable aux[] = new Comparable[arr.length];
		mergeSort(arr, aux, 0, arr.length - 1);
	}

	private static void mergeSort(Comparable[] arr, Comparable[] aux, int low, int high) {

		if (high <= low) {
			return;
		}

		int mid = low + (high - low) / 2;

		mergeSort(arr, aux, low, mid);
		mergeSort(arr, aux, mid + 1, high);
		merge(arr, aux, low, high, mid);

	}

	private static void merge(Comparable[] arr, Comparable[] aux, int low, int high, int mid) {

		for (int k = low; k <= high; k++) {
			aux[k] = arr[k];
		}

		int i = low;
		int j = mid + 1;

		for (int k = low; k <= high; k++) {
			if (i > mid)
				arr[k] = aux[j++];
			else if (j > high)
				arr[k] = aux[i++];
			else if (less(aux[i], aux[j]))
				arr[k] = aux[i++];
			else
				arr[k] = aux[j++];
		}

	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void main(String args[]) {
		Integer a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 9 };

		mergeSort(a);

		for (Integer i : a) {
			System.out.print(" " + i);
		}
	}

}
