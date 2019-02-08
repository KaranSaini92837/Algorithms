package com.algorithms;

public class RevFibonacci {
	//int sum = 0;
	public int fib(int n) {
		if(n <= 1) return n;
		
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String [] args) {
		
		RevFibonacci r = new RevFibonacci();
		System.out.println(r.fib(5));
	}

}
