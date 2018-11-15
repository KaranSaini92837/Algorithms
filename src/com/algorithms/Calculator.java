package com.algorithms;

import javax.script.ScriptException;

public class Calculator {

	public static int calculate(String expression) throws ScriptException {
		
//		ScriptEngineManager mgr = new ScriptEngineManager();
//	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
//	    
//	    return (int) engine.eval(expression);

		String s = "";
		
		int sum = 0;
		char[] arr = expression.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == '+') {
				sum = sum + Integer.parseInt(s);
				s = "";
				continue;
			} else if (arr[i] == '-') {
				sum = sum - Integer.parseInt(s);
				s = "";
				continue;
			}
			if (arr[i] != '+' || arr[i] != '-') {
				s = s + arr[i];
			}
		}

		return sum;
		
	}

	public static void main(String args[]) throws ScriptException {

		String s = "1+2+3-5";

		System.out.println(calculate(s));

	}

}
