package com.algorithms;

public class Driver {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length];
		int d = 3;
		int l = a.length;
		for (int i = 0; i < l; i++) {
			if (i == d) {
				b[0] = a[i];
			} else {
				b[i + l - d] = a[i];
			}

		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}

/*
 * private int top = -1; private int arr[] = new int[100];
 * 
 * public void push(int x) {
 * 
 * if(top == arr.length -1) { System.err.println("Error stack overflow"); }
 * arr[++top] = x;
 * 
 * }
 * 
 * public int pop() { if(top == -1) {
 * System.err.println("Error: NO element to pop!!!!!"); } top--; return 0; }
 * 
 * public int top() { return arr[top]; }
 * 
 */
