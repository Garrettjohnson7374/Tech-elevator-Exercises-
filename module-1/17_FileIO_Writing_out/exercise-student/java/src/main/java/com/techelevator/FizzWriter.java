package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("File path for FizzBuzz.txt?");
        String fileOutput = userInput.nextLine();

        try (PrintWriter destinationOutput = new PrintWriter(fileOutput)) {
            for (int i = 1; i < 301; i++) {
                String number = String.valueOf(i);
                if (i % 5 == 0 &&
                        i % 3 == 0) {
                    destinationOutput.println("FizzBuzz");
                } else if (i % 3 == 0 || number.contains("3")) {
                    destinationOutput.println("Fizz");
                }else if (i % 5 == 0 || number.contains("5")) {
                    destinationOutput.println("Buzz");
                }else {
                    destinationOutput.println(number);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File can't write");
        }
    }
}
