package com.palaniyappan.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangram {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		boolean isPangram = false;
		String inputLine = in.nextLine();
		//String inputLine = "We promptly judged antique ivory buckles for the next prie";
		List<Character> alphabetsList = new ArrayList<>();
		char currentChar;
		if(inputLine != null) {	
			inputLine = inputLine.toLowerCase();
			int lengthOfInput = inputLine.length();
			for(int i = 0; i < lengthOfInput; i++) {
				currentChar = inputLine.charAt(i);
				if(currentChar != ' ' && !alphabetsList.contains(currentChar)) {
					alphabetsList.add(currentChar);
				}
				if(alphabetsList.size() == 26) {
					isPangram = true;
					break;
				}
			}
		}
		if(isPangram) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
		
		if(in != null) {
			in.close();
		}
	}
}
