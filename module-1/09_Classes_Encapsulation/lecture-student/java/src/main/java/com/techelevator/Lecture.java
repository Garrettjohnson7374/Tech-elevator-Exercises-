package com.techelevator;


public class Lecture {

    public static void main(String[] args) {
    Card firstCard = new Card();
    Card secondCard = new Card();
        System.out.println(firstCard.getSuit());    //prints out reference
        System.out.println(secondCard.getRank());    //prints out reference
        System.out.println(secondCard.isFaceUp());    //prints out reference
        System.out.println(secondCard.getSuit());
        System.out.println(firstCard.getDiscription());
        System.out.println(secondCard.getValue());
        System.out.println(secondCard.getDiscription() + " has a value of " + secondCard.getValue());

        Card thirdCard = new Card("queen", "hearts");
        System.out.println(thirdCard.getDiscription());
        thirdCard.flip();
        System.out.println(thirdCard.getDiscription());
        System.out.println(thirdCard.getValue());


        Deck myDeck = new Deck();
        myDeck.shuffle();
        Card firstPick = myDeck.drawCard();
        firstPick.flip();
        System.out.println(firstPick.getDiscription());

        while (myDeck.getCardCount() > 0){
            Card pick = myDeck.drawCard();
            pick.flip();
            System.out.println(pick.getDiscription());
        }

    }

}
