package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {
        // Step One: Declare a Map
        Map<String, Boolean> fruits = new HashMap<String, Boolean>();
    	
    	// Step Two: Add items to a Map
        fruits.put("Apple", true);
        fruits.put("Banana", false);
    	
    	// Step Three: Loop through a Map
        for(Map.Entry<String, Boolean> fruits : fruits.entrySet()) {

            if (fruits.getValue()) {
                System.out.println(fruits.getKey() + " is red.");
            } else {
                System.out.println(fruits.getKey() + " is not, what is wrong with you?");
            }
        }



