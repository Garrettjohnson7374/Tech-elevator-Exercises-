package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {
    @Test
    public void chocolate_less_than_three() {

        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Ch", 5);
        Assert.assertEquals("ChChChChCh", result);

    }
@Test
    public void chocolate_empty_string() {

        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("", 5);
        Assert.assertEquals("", result);

    }
@Test
    public void chocolate_empty() {

        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Choco", 5);
        Assert.assertEquals("ChoChoChoChoCho", result);

    }

}
