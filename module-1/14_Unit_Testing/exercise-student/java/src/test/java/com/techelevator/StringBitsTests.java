package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {
    @Test
    public void stringBits_hello(){
        StringBits sut = new StringBits();
        Assert.assertEquals("Hlo", sut.getBits("Hello"));
    }
    @Test
    public void stringBits_hi(){
        StringBits sut = new StringBits();
        Assert.assertEquals("H", sut.getBits("Hi"));
    }
    @Test
    public void stringBits_heeololeo(){
        StringBits sut = new StringBits();
        Assert.assertEquals("Hello", sut.getBits("Heeololeo"));
    }
}
