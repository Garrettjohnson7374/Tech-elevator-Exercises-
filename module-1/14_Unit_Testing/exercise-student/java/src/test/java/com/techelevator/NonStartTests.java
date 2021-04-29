package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {
    @Test
    public void hello_there_test(){
    NonStart sut = new NonStart();
        Assert.assertEquals("ellohere", sut.getPartialString("Hello", "There"));
    } @Test
    public void java_code_test(){
    NonStart sut = new NonStart();
        Assert.assertEquals("avaode", sut.getPartialString("java", "code"));
    } @Test
    public void shotl_java_test(){
    NonStart sut = new NonStart();
        Assert.assertEquals("hotlava", sut.getPartialString("shotl", "java"));
    }
}
