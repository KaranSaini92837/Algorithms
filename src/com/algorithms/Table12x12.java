package com.algorithms;

public class Table12x12 {
	
	public static void main(String args[]) {
		for(int i = 1; i<=12;i++) {
			for(int j = 1; j<=12;j++) {
				int number = i*j;
				int count = 0;
				while(number > 0) {
					number = number / 10;
					count = count + 1; 
				}
				if(count == 1) {
				System.out.print(i*j+"   ");
				}
				else if(count == 2) {
					System.out.print(i*j+"  ");
				}
				else if(count == 3) {
					System.out.print(i*j+" ");
				}
			}
			System.out.print("\n");
		}
	}

}
