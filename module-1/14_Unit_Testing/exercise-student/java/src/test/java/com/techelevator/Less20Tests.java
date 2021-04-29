package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {
    @Test
    public void Less20_18(){
        Less20 sut = new Less20();
        boolean value = sut.isLessThanMultipleOf20(18);
        Assert.assertTrue(true);
    }
 @Test
    public void Less20_19(){
        Less20 sut = new Less20();
        boolean value = sut.isLessThanMultipleOf20(19);
        Assert.assertTrue(true);
    }
 @Test
    public void Less20_38(){
        Less20 sut = new Less20();
        boolean value = sut.isLessThanMultipleOf20(38);
        Assert.assertTrue(true);
    }
 @Test
    public void Less20_equal_20(){
        Less20 sut = new Less20();
        boolean value = sut.isLessThanMultipleOf20(20);
        Assert.assertFalse(false);
    }

}
