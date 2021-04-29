package com.techelevator;

import java.util.Scanner;

//Tf = Tc * 1.8 + 32
public class TempConvert {

	public static void main(String[] args) {
		double finalTemp = 0.0;
		System.out.print("enter your temperature.");
		Scanner input = new Scanner(System.in);
		String temp = input.nextLine();
		double tempParse = Double.parseDouble(temp);


		System.out.print("is the temperature Celsius or Fahrenheit? C/F");
		String response = input.nextLine();
		if (response.equals("C") || response.equals("c")){
			finalTemp = (tempParse -32)/1.8 ;
			System.out.println(tempParse + " Converted to " + finalTemp);
		}

		//add Fahrenheit conversion equation and and response "F"
		if (response.equals ("F") || response.equals ("f")){
			finalTemp = (tempParse * 1.8) + 32;
			System.out.println(tempParse + " Converted to " + finalTemp + "C");

		}
	}
}
