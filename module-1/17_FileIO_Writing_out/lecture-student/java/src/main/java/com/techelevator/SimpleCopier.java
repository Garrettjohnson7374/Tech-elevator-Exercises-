package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class SimpleCopier {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a file to copy");
        String sourceFilename = userInput.nextLine();

        System.out.print("Please name the new copy");
        String destFilename = userInput.nextLine();

        Path source = Path.of(sourceFilename);
        try (Scanner sourceScanner = new Scanner(source)) {
            try (PrintWriter destWriter = new PrintWriter(destFilename)) {

                while (sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();
                    destWriter.println();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Output file Couldn't be written to.");
            }
        } catch (IOException e) {
            System.out.println("Couldn't read from input file.");
        }
    }
}

