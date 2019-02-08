package com.algorithms;

public class ValidParantheses {

//	public static boolean isValid(String s) {
//
//		Stack myStack = new Stack();
//		myStack.peek();
//		int mid = (s.length() / 2) -1;
//
//		if (s.length() % 2 != 0) {
//			return false;
//		} else {
//			for (int i = 0; i <= mid; i++) {
//				myStack.push(s.charAt(i));
//			}
//			for (int i = mid + 1; i < s.length(); i++) {
//				if (myStack.peek() == '(') {
//					if ((s.charAt(i)) == ')') {
//						myStack.pop();
//						continue;
//					} else
//						return false;
//				} else if (myStack.peek() == '{') {
//					if ((s.charAt(i)) == '}') {
//						myStack.pop();
//						continue;
//					} else
//						return false;
//				} else if (myStack.peek() == '[') {
//					if (s.charAt(i) == ']') {
//						myStack.pop();
//						continue;
//					} else
//						return false;
//				}
//			}
//		}
//		return true;
//	}
	
//	 public static boolean isValid(String s) {
//
//			Stack myStack = new Stack();
//			int mid = (s.length() / 2) -1;
//
//			if (s.length() % 2 != 0) {
//				return false;
//			} else {
//				for (int i = 0; i <= mid; i++) {
//					myStack.push(s.charAt(i));
//				}
//				for (int i = mid + 1; i < s.length(); i++) {
//					if (myStack.peek() == '(') {
//						if ((s.charAt(i)) == ')') {
//							myStack.pop();
//							continue;
//						} else
//							return false;
//					} else if (myStack.peek() == '{') {
//						if ((s.charAt(i)) == '}') {
//							myStack.pop();
//							continue;
//						} else
//							return false;
//					} else if (myStack.peek() == '[') {
//						if (s.charAt(i) == ']') {
//							myStack.pop();
//							continue;
//						} else
//							return false;
//					}
//				}
//			}
//			return true;
//		}
	
	 public static boolean isValid(String s) {
		 
		 if(s.length()%2 != 0) {
			 return false;
		 }
		 else {
			 Stack myStack = new Stack();
			 
			 for(int i = 0; i<s.length() ;i++) {
				 
			 }
		 }
		 return false;
	 }
	

	public static void main(String[] args) {

		String s = "{()}[]))";

		System.out.println(isValid(s));

	}

}
