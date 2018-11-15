package com.algorithms;

public class PermutationString {

	public static boolean hasString(String s1, String s2) {

//		if (s1.length() > s2.length()) {
//			s2.hashCode();
//			for (int i = 0; i < s1.length()-s2.length(); i++) {
//				String s = s1.substring(i, i + s2.length());
//				if (s.hashCode() == s2.hashCode()) {
//					return true;
//				} 
//			}
//
//		} else {
//			s1.hashCode();
//			for (int i = 0; i < s2.length()-s1.length(); i++) {
//				String s = s2.substring(i, i + s1.length());
//				if (s.hashCode() == s1.hashCode()) {
//					return true;
//				} 
//			}
//
//		}
//
//		return false;
		
//		if(s1.hashCode()==s2.hashCode()) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		int [] letters = new int [128];
		for(int i=0;i<s1.length();i++) {
			letters[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++) {
			letters[s2.charAt(i)]++;
			if(letters[s2.charAt(i)] <0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		String A = "DOG";
		String B="GOfD";
		
		System.out.println(hasString(A, B));
	}
}
