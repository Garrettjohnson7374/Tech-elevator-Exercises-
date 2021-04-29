package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		double finalDistance = 0.0;
		System.out.print("enter your distance.");
		Scanner input = new Scanner(System.in);
		String distance = input.nextLine();
		double distanceParse = Double.parseDouble(distance);

		System.out.print("convert to F or M?");
		String response = input.nextLine();
		if (response.equals("F") || response.equals("f")) {
			finalDistance = (distanceParse * 3.2808399);
			System.out.format(distanceParse + " Converted to %.0f\n", finalDistance);
		}
		if (response.equals("M") || response.equals("m")) {
			finalDistance = (distanceParse * 0.3048);
			System.out.format(distanceParse + " Converted to %.0f \n", finalDistance);

		}
	}
}
