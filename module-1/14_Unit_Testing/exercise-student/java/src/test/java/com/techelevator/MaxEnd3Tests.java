package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {
    @Test
    public void make_array_Test_1_2_3() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[]{1, 2, 3});
        Assert.assertArrayEquals(new int[]{3, 3, 3}, nums);
    }
   @Test
    public void make_array_Test_11_5_9() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[]{11, 5, 9});
        Assert.assertArrayEquals(new int[]{11, 11,11}, nums);
    }
@Test
    public void make_array_Test_2_11_3() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[]{2, 11, 3});
        Assert.assertArrayEquals(new int[]{3, 3,3}, nums);
    }

}
