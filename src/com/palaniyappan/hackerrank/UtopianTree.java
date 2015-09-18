package com.palaniyappan.hackerrank;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int nbrOfTestCases = in.nextInt(); 
		int noOfCycles = 0;
		int height = 1;
		
		for(int i = 0; i < nbrOfTestCases; i++) {
			noOfCycles = in.nextInt();
			height = 1;
			for(int j = 1; j <= noOfCycles; j++) {
				if(j%2 == 0){
					height++;
				} else {
					height = height * 2;
				}
			}
			System.out.println(height);
		}
		if(in != null) {
			in.close();
		}
	}
}
