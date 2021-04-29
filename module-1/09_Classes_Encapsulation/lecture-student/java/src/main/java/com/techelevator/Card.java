package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Card {

    private String suit;
    private String rank;
    private boolean faceUp;

    public String getSuit() {
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public boolean isFaceUp() {
        return faceUp;
    }
    public void setFaceUp(boolean faceUp){
        this.faceUp = faceUp;
    }
    public String getDiscription(){
        String description = "Back of Card";
        if(faceUp)
        {
            description =  rank + " of " + suit;
        }
        return description;
    }
    public int getValue() {
        Map<String, Integer> cardValues = new HashMap<>();
            cardValues.put("two", 2);
            cardValues.put("three", 3);
            cardValues.put("four", 4);
            cardValues.put("five", 5);
            cardValues.put("six", 6);
            cardValues.put("seven", 7);
            cardValues.put("eight", 8);
            cardValues.put("nine", 9);
            cardValues.put("ten", 10);
            cardValues.put("jack", 11);
            cardValues.put("queen", 12);
            cardValues.put("king", 13);
            cardValues.put("ace", 14);
        return cardValues.get(rank);
    }
    public Card(){
        suit = "spades;";
        rank = "ace";
    }
    public Card(String rank, String suit){
       this.rank = rank;
       this.suit = suit;
    }
    public void flip(){
        faceUp = !faceUp;
    }
    public boolean isHigherThan(Card otherCard){
        return this.getValue() > otherCard.getValue();
    }




}
