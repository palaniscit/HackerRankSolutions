package com.palaniyappan.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parser {
	
	public boolean checkParenthesesBalance(String input) {
		Map<Character, Character> parenMap = new HashMap<>();
		parenMap.put('{', '}');
		parenMap.put('(', ')');
		parenMap.put('[', ']');
		Map<Character, Character> reverseParenMap = new HashMap<>(); 
		reverseParenMap.put('}','{');
		reverseParenMap.put(')', '(');
		reverseParenMap.put(']', '[');
		Stack<Character> openBracesStack = new Stack<>();
		Character currentChar;
		if(input != null) {
			int lengthOfString = input.length();
			if(lengthOfString % 2 != 0) {
				return false; 
			}
			for(int i = 0; i < lengthOfString; i++) {
				currentChar = input.charAt(i);
				if(parenMap.containsKey(currentChar)) {
					openBracesStack.push(currentChar);
				} else if(reverseParenMap.containsKey(currentChar)) {
					if(!openBracesStack.isEmpty()) {
						if(openBracesStack.get(openBracesStack.size() - 1) != reverseParenMap.get(currentChar)) {
							return false;
						} else {
							openBracesStack.pop();
						}
					}
				}
				
						
			}
		}
		return true;
	}
}
