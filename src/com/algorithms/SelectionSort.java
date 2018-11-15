package com.algorithms;

import java.util.Random;

public class SelectionSort {
	
	public static void selectionSort(int [] arr) {
		
		int n= arr.length;
		for(int i=0; i<n-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public static void main(String args[]) {

		
		int arr[] = new int[10];
		
		Random random = new Random();
		for(int i= 0;i<10;i++) {
			arr[i] = random.nextInt(50)+0;
		}
		
		System.out.println("Unsorted array \n");
		for(int i : arr) {
			System.out.print(i+"\n");
		}
		
		selectionSort(arr);
		
		System.out.println("Sorted array \n");
		for(int i : arr) {
			System.out.print(i+"\n");
		}
		
	}

}
