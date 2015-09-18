package com.palaniyappan.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nbrOfTests = in.nextInt();
		//int nbrOfTests = 1;
		String currentString = null;
		int stringLength;
		List<Integer> asciiList = new ArrayList<>();
		List<Integer> reverseList = new ArrayList<>();
		int asciiValue;
		int fwdCurrentValue;
		int fwdNextValue;
		int revCurrentValue;
		int revNextValue;
		boolean isNotFunny = false;
		
		in.nextLine();
		for(int j = 0; j < nbrOfTests; j++) {
			currentString = in.nextLine();
			//currentString = "bcxz";
			asciiList.clear();
			reverseList.clear();
			if(currentString != null && !currentString.trim().isEmpty()) {
				stringLength = currentString.length();
				isNotFunny = false;
				for(int i = 0; i < stringLength; i++) {
					asciiValue = (int)currentString.charAt(i);
					asciiList.add(asciiValue);
				}
				reverseList.addAll(asciiList);
				Collections.reverse(reverseList);
				for(int i = 0; i < asciiList.size()-1; i++) {
					fwdCurrentValue = asciiList.get(i);
					fwdNextValue = asciiList.get(i + 1);
					revCurrentValue = reverseList.get(i);
					revNextValue = reverseList.get(i + 1);
					if(Math.abs(fwdNextValue - fwdCurrentValue) 
							!= Math.abs(revNextValue - revCurrentValue)) {
						isNotFunny = true;
						break;
					}
				}
				if(isNotFunny) {
					System.out.println("Not Funny");
				} else {
					System.out.println("Funny");
				}
			}
		}
		
		if(in != null) {
			in.close();
		}
	}
}
