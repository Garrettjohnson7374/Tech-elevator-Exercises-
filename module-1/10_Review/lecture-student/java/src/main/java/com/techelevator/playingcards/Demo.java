package com.techelevator.playingcards;


import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        Map<String,Card> deltCards = new HashMap<>();
        Deck deck = new Deck();
        deck.shuffle();
        for(Map.Entry<String,Card> entry : deltCards.entrySet()) {
            Card currentCard = entry.getValue();
            currentCard.flip();
            System.out.println(entry.getKey() + " has the card " + currentCard.getDescription());

            String rank = currentCard.getRank();
            boolean hasFaceCard = rank.equals("jack") || rank.equals ("queen")

        }


    }
}
