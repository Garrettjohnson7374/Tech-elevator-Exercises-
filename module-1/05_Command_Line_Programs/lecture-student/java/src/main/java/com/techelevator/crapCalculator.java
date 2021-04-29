package com.techelevator;

import java.util.Scanner;

public class crapCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to the crap calculator. We calculate crap.");
        boolean finished = false;
        while (finished == false) ;{
            // prompt for price
            System.out.print("Enter your prices spaced apart.");
            Scanner input = new Scanner(System.in);
            String prices = input.nextLine();
            String[] priceArray = prices.split(" ");
            //prompt for discount
            System.out.print("Enter discount (it's a percentage)");
            String discount = input.nextLine();
            //Extra MATH
            double total = 0;
            for (int i = 0; i < priceArray.length; i++) {
                double undiscountedPrice = Double.parseDouble(priceArray[i]);
                total += undiscountedPrice;
            }


            // Math
            int discountPercent = Integer.parseInt(discount);
            double discountAmount = total * (discountPercent / 100.0);
            double discountedTotal = total - discountAmount;


            //result output
            System.out.format("Undiscounted price$ %.2f.\n", +total);
            System.out.format("It costs $ %.2f.\n", +discountedTotal);
            System.out.print("Can I go now? ");
            String response= input.nextLine();
            if (response.equals ("y"));{
                finished = true;
        }
        }
            System.out.println("Anyway all i got to say about that, go away now.");
    }
}
