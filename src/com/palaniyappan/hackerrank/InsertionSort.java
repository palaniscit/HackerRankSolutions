package com.palaniyappan.hackerrank;

import java.util.Scanner;

public class InsertionSort {
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
		int lastItem = ar[ar.length-1];
		boolean sorted = false;
		
		for(int i = (ar.length - 2); i >= 0; i--) {
			if(ar[i] > lastItem) {
				ar[(i + 1)] = ar[i];
				printArray(ar);
			} else {
				ar[(i + 1)] = lastItem;
				printArray(ar);
				sorted = true;
				break;
			}
		}
		if(!sorted) {
			ar[(0)] = lastItem;
			printArray(ar);
		}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    	 
    	 /*int [] ar = {2, 4, 6, 8, 3};
         insertIntoSorted(ar);
         */
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
