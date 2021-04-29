package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {
    @Test
    public void same_first_last_false_1_2_3(){
        SameFirstLast sut = new SameFirstLast();
        Assert.assertFalse(sut.isItTheSame(new int[] {1,2,3}));
    }
 @Test
    public void same_first_last_true_1_2_3_1(){
        SameFirstLast sut = new SameFirstLast();
        Assert.assertTrue(sut.isItTheSame(new int[] {1,2,3,1}));
    }
@Test
    public void same_first_last_true_1_2_1(){
        SameFirstLast sut = new SameFirstLast();
        Assert.assertTrue(sut.isItTheSame(new int[] {1,2,1}));
    }

}
