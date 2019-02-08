package com.algorithms;

public class MergeSort {

	public static void mergeSort(int a[]) {

		if (a.length == 1) {
			return;
		}
		int mid = a.length / 2;

		int l[] = new int[mid];
		int r[] = new int[a.length - mid];

		for (int i = 0; i < l.length; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < mid + r.length; i++) {
			r[i - mid] = a[i];
		}

		mergeSort(l);
		mergeSort(r);
		merge(a, l, r);

	}

	public static void merge(int a[], int[] l, int[] r) {
		int nL = l.length;
		int nR = r.length;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nL && j < nR) {
			if (l[i] <= r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] = r[j];
				j++;
			}
			k++;
		}

		while (i < nL) {
			a[k] = l[i];
			i++;
			k++;
		}

		while (j < nR) {
			a[k] = r[j];
			j++;
			k++;
		}
	}

	public static void main(String args[]) {
		int a[] = { 3, 4, 6, 7, 2, 8, 1 };
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}

}
