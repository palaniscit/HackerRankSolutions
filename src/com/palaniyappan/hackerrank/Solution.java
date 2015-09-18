package com.palaniyappan.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws Exception{
		try{
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			String input;
			int nbrOfIntegers = 0;
			int count = 1;
			String inputNumbers = null;

			while((input=br.readLine())!=null){
				if(count == 1) {
					nbrOfIntegers = Integer.valueOf(input);
				} else if(count == 2) {
					inputNumbers = input;
				}
				count++;
			}
			
			//nbrOfIntegers = 4;
			//inputNumbers = "-20 -3916237 -357920 30";
			
			String[] numbersList;
			int minDifference = 0; 
			int currentNumber;
			int comparingNumber;
			List<Integer> outputList = new ArrayList<>();
			int currentDifference;
			int firstTime = 0;
			
			if(inputNumbers != null) {
				numbersList = inputNumbers.split(" ");
				for(int i = 0; i < nbrOfIntegers; i++) {
					currentNumber = Integer.valueOf(numbersList[i]);
					for(int j = 0; j < nbrOfIntegers; j++) {
						if(i == j) {
							continue;
						}
						comparingNumber = Integer.valueOf(numbersList[j]);
						
						currentDifference = Math.abs(currentNumber - comparingNumber);
						
						if(firstTime == 0) {
							minDifference = currentDifference;
							outputList.add(currentNumber);
							outputList.add(comparingNumber);
							firstTime++;
							continue;
						}
						
						if(currentDifference < minDifference) {
							outputList.clear();
							minDifference = currentDifference;
							if(!outputList.contains(currentNumber) && !outputList.contains(comparingNumber)) {
								outputList.add(currentNumber);
								outputList.add(comparingNumber);
							}
							continue;
						}
						
						if(currentDifference == minDifference) {
							if(!outputList.contains(currentNumber) && !outputList.contains(comparingNumber)) {
								outputList.add(currentNumber);
								outputList.add(comparingNumber);
							}
						}
						
					}
				}
				String outputString = "";
				for(Integer i: outputList) {
					outputString = outputString + i + " ";
				}
				System.out.println(outputString.trim());
			}
			

		}catch(IOException io){
			io.printStackTrace();
		}
	}

}
