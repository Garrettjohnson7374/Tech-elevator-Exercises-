package com.techelevator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Type the word you would like to find: ");
        String stringToSearch = userInput.nextLine();

        System.out.println("What word would you like as the replacement?");
        String replacementWord = userInput.nextLine();

        System.out.println("Which file do you want search?");
        String input = userInput.nextLine();

        System.out.println("Please enter a name for the new file).");
        String copiedFile = userInput.nextLine();

            Path source = Path.of(input);
            try(Scanner sourceScanner = new Scanner (source)){
                try(PrintWriter destinationWriter = new PrintWriter(copiedFile)){
                    while(sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();

                    if (line.contains(stringToSearch)) {
                        String replace = line.replaceAll(stringToSearch, replacementWord);
                        destinationWriter.println(replace);
                        }else{
                        destinationWriter.println(line);
                    }
                    }
                }catch (FileNotFoundException e){
                    System.out.println("can't write to file!");
                }
                }catch (IOException e) {
                System.out.println("Can't find file!");
            }
        }
    }







