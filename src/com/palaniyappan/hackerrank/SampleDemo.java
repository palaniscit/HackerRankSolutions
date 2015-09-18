package com.palaniyappan.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleDemo{
	/*
	 * Complete the function below.
	 */

	    static long kSub(int k, int[] nums) {
	        long subCount = 0;
	        int currentNum = 0;
	        int previousNum = 0;
	        int sum = 0;
	        
	        if(nums.length > 0) {
	            for(int i = 0; i < nums.length; i++) {
	                if(i == 0) {
	                    currentNum = nums[i];
	                    if(currentNum%k == 0) {
	                        subCount++;
	                    }
	                    sum = sum + currentNum;
	                } else {
	                    previousNum = nums[i-1];
	                    currentNum = nums[i];
	                    if(currentNum%k == 0) {
	                        subCount++;
	                    }
	                    if((previousNum+1) == currentNum) {
	                        sum = sum + currentNum;
	                        if(sum%k == 0) {
	                            subCount++;
	                        }
	                    } else {
	                        sum = 0;
	                    }
	                }
	            }
	        }
	        
	        return subCount;
	    }
	    
	    public static void main(String[] args) {
	    	int[] nums = {1,2,3,4,1};
	    	long count = kSub(3, nums);
	    	System.out.println(count);
	    }
	
}
