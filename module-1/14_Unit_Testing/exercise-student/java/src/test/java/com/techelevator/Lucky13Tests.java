package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {
    @Test
    public void Lucky13Test_0_2_4(){
        Lucky13 sut = new Lucky13();
        int [] nums = new int[] { 0, 2, 4 };
        boolean noOnesOrThrees = sut.getLucky(nums);
    Assert.assertTrue(noOnesOrThrees);
}
/*@Test
public void Lucky13Test() {
    Lucky13 sut = new Lucky13();
    Assert.assertTrue(sut.getLucky(new int[]{0, 2, 4}));
}*/
    @Test
    public void lucky13_false_1_2_3(){
        Lucky13 sut = new Lucky13();
        int [] nums = new int[]{1,2,3};
        boolean noOneOrThree = sut.getLucky(nums);
        Assert.assertFalse(noOneOrThree);
    }
    @Test
    public void lucky13_false_1_2_4(){
       Lucky13 soot = new Lucky13();
    int [] nums = new int[]{1,2,4};
    Boolean noOneOrThree = soot.getLucky(nums);
    Assert.assertFalse(noOneOrThree);

    }
}
