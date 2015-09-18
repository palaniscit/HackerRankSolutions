package com.palaniyappan.hackerrank;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int searchInt = Integer.parseInt(in.nextLine());
        int length = Integer.parseInt(in.nextLine());
        String intStr = in.nextLine();
        String[] splitStr = intStr.split(" ");
        int currentItem;
        
        for (int i = 0; i < length; i++) {
        	currentItem = Integer.parseInt(splitStr[i]);
			if(currentItem == searchInt) { 
				System.out.println(i);
				break;
			}
		}
        
        if(in != null) {
        	in.close();
        }
        
    }
}
