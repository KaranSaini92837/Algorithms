package com.algorithms;

public class InsertionSort {

	public static int[] insertionSort(int arr[]) {
		// 3,4,2
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];// 2
			int j = i - 1;// 1
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		return arr;

	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		// Random random = new Random();
		// for(int i= 0;i<10;i++) {
		// arr[i] = random.nextInt(50)+0;
		// }
		System.out.println("Unsorted array \n");
		for (int i : arr) {
			System.out.print(i + "\n");
		}

		int k[] = insertionSort(arr);
		System.out.println("\n Sorted array \n");
		for (int i : k) {
			System.out.print(i + "\n");
		}

	}

}
