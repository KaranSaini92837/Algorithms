package com.algorithms;

public class Stack {

	private int MAXX = 1000;

	private int arr[] = new int[MAXX];

	private int top = -1;

	public boolean push(int value) {
		if (top >= MAXX - 1) {
			System.out.println("The stack is full");
			return false;
		} else {
			arr[++top] = value;
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			return -1;
		} else {
			int x = arr[top--];
			return x;
		}
	}

	public int peek() {
		if (top < 0) {
			return -1;
		} else {

			return arr[top];
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String args[]) {

		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		System.out.println(stack.pop());
		// System.out.println(stack.pop());
		System.out.println(stack.top);
		System.out.println(stack.isEmpty());
	}

}
