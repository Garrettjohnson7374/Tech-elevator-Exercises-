package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
     @Test
    public void test_is_not_weekend_under_limit() {
         CigarParty sut = new CigarParty();
         boolean haveParty = sut.haveParty(30, false);
         Assert.assertFalse(haveParty);
     }
    @Test
    public void not_weekend_minimum_is_fifty(){
        CigarParty sut = new CigarParty();
        boolean haveParty = sut.haveParty(50, false);
        Assert.assertTrue(haveParty);
    }
    @Test
    public void is_weekend_and_maximum_seventy(){
        CigarParty sut = new CigarParty();
        boolean haveParty = sut.haveParty(70, true);
        Assert.assertTrue(haveParty);
    }

}
