package com.algorithms;

public class Driver {

	public static void main(String[] args) {
		
		String s = new String("ABCD");
		String s1 = new String("ABCD");
		//s = s1;
		
		int x = 1;
		int y = 1;
		
		System.out.println(s1==s);
		System.out.println(s1.equals(s));
		System.out.println(x==y);
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
