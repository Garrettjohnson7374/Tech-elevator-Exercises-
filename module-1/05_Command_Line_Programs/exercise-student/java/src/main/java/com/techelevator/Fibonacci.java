package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 //make a loop to make the answer, no arrays needed.
		int currentNum = 0;
		int lastNum = 1;
		int twoNumAgo = 0;

		System.out.print("enter your number.");
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		int numParse = Integer.parseInt(num);

		System.out.print("0, 1, ");
		currentNum = twoNumAgo + lastNum;
		while (currentNum < numParse) {

			System.out.print(currentNum + ", ");
			twoNumAgo = lastNum;
			lastNum = currentNum;
			currentNum = twoNumAgo + lastNum;
		}



	}

}
