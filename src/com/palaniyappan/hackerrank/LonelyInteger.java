package com.palaniyappan.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {
	static int lonelyinteger(int[] a) {
		List<Integer> integerArray = new ArrayList<>();
		int lonelyInteger = 0;
		int nbrOfIntegers = a.length;
		for(int i = 0; i < nbrOfIntegers; i++) {
			integerArray.add(a[i]);
		}
		
		Collections.sort(integerArray);
		for(int i = 0; i < nbrOfIntegers; i = i + 2) {
			if(i == nbrOfIntegers - 1) {
				lonelyInteger = integerArray.get(i);
				break;
			}
			if(integerArray.get(i) != integerArray.get(i + 1)) {
				lonelyInteger = integerArray.get(i);
				break;
			}
		}
		
		return lonelyInteger;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}
	
}
