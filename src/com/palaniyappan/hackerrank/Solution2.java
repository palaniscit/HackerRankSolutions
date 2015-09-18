package com.palaniyappan.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws IOException{
        String str = "aaaaabbbbbbbbbccccpqrstuvvv";
        System.out.println(compress(str));
    }
	
	static String compress(String str) {
		String compressedString = "";
		Character currentCompressedChar;
		Character currentCharacter;
		int occurence = 1;
		
		if(str != null && str.length() > 0) {
			currentCompressedChar = str.charAt(0);
			int length = str.length();
			for(int i = 0; i < length; i++) {
				if(i == 0) {
					continue;
				}
				
				currentCharacter = str.charAt(i);
				if(currentCharacter.equals(currentCompressedChar)) {
					occurence++;
				} else {
					if(occurence > 1) {
						compressedString = compressedString + currentCompressedChar + occurence;
						occurence = 1;
					} else {
						compressedString = compressedString + currentCompressedChar;
					}
					currentCompressedChar = currentCharacter;
				}
				if(i == length - 1) {
					if(occurence > 1) {
						compressedString = compressedString + currentCompressedChar + occurence;
					} else {
						compressedString = compressedString + currentCompressedChar;
					}
				}
			}
		}
		return compressedString;
    }
}
