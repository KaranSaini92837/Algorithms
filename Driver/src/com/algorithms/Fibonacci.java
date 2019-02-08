package com.algorithms;

public class Fibonacci {

	public static void main(String args[]) {
		System.out.println(fib(10));
		// System.out.println(findFibonacci(6));
	}

	public static int findFibonacci(int value) {

		if (value <= 1) {
			return value;
		}
		return findFibonacci(value - 1) + findFibonacci(value - 2);
	}

	public static int fib(int value) {
		int arr[] = new int[value + 1];
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= value; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[value];
	}

}
