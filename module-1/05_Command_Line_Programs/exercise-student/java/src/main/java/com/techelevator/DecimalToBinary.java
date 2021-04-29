package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
//find java standard to binary method on google
	public static void main(String[] args) {


		System.out.print( "please enter your series of decimals");
		Scanner decimalInput = new Scanner(System.in);
		String binaryOut = decimalInput.nextLine();
		String[] binaryArray = binaryOut.split(" ");

		for(int i = 0; i < binaryArray.length; i ++){
			int binaryParse = Integer.parseInt(binaryArray[i]);
			String decimal = Integer.toBinaryString(binaryParse);
			System.out.println(binaryParse + "in binary " + decimal);
		}
	}

}
