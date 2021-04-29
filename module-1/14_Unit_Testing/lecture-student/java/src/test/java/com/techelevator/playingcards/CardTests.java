package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

public class CardTests {

    @Test
    public void no_arg_constructor_makes_ace_of_spades(){
        //arrange

        //act
        Card sut =new Card();


        //assert
        Assert.assertEquals("Ace", sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
    }
    @Test
    public void constructor_makes_specified_card(){

        Card sut = new Card("jack", Suit.DIAMONDS);

        Assert.assertEquals( "jack", sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS, sut.getSuit());
    }

    @Test
    public void getDescription_returns_back_of_card_when_face_down(){
        //arrange
        Card sut = new Card();
        sut.setFaceUp(true);
        //act
        String description = sut.getDescription();
        //Assert
        Assert.assertEquals("Ace of Spades", description);
    }

    @Test
            public void getValue_for_rank() {
        int sut = Card.getValueForRank("Ace");
        Assert.assertEquals(14, sut);
    }

    @Test
            public void is_higher_than(){
        Card sut = new Card();

        Card othercard = new Card("Jack", Suit.DIAMONDS);

        Assert.assertTrue(sut.isHigherThan(othercard));
    }
    @Test
    public void getHalfValue_returns_tow_and_a_half_for_five(){
        Card sut = new Card;
        double value = sut.getHalfValue();
        Assert.assertEquals(2.5, value);
    }
}

