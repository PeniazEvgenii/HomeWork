package test.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {

    @DisplayName("Test sort with positive array")
    @Test
    public void sortTest1() {
       Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.sort(new int[]{1,2,3,4,5,6}));
       Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.sort(new int[]{6,5,4,3,2,1}));
       Assertions.assertArrayEquals(new int[]{1,5,9,9,9,99}, SortsUtils.sort(new int[]{9,1,5,99,9,9}));
    }

    @DisplayName("Test sort with empty and the same array")
    @Test
    public void sortTest2() {
        Assertions.assertArrayEquals(new int[]{}, SortsUtils.sort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{10}, SortsUtils.sort(new int[]{10}));
        Assertions.assertArrayEquals(new int[]{1,1,1,1}, SortsUtils.sort(new int[]{1,1,1,1}));
        Assertions.assertArrayEquals(new int[]{0,0,0,0}, SortsUtils.sort(new int[]{0,0,0,0}));

    }

    @DisplayName("Test sort with negative array")
    @Test
    public void sortTest3() {
        Assertions.assertArrayEquals(new int[]{-6,-5,-4,-3,-2,-1}, SortsUtils.sort(new int[]{-1,-2,-3,-4,-5,-6}));
        Assertions.assertArrayEquals(new int[]{Integer.MIN_VALUE,-1,0,1,Integer.MAX_VALUE}, SortsUtils.sort(new int[]{Integer.MAX_VALUE,-1,0,1,Integer.MIN_VALUE}));
    }


    @DisplayName("Test shake with positive array")
    @Test
    public void shakeTest1() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.shake(new int[]{1,2,3,4,5,6}));
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.shake(new int[]{6,5,4,3,2,1}));
        Assertions.assertArrayEquals(new int[]{1,5,9,9,9,99}, SortsUtils.shake(new int[]{9,1,5,99,9,9}));
    }

    @DisplayName("Test shake with empty and the same array")
    @Test
    public void shakeTest2() {
        Assertions.assertArrayEquals(new int[]{}, SortsUtils.shake(new int[]{}));
        Assertions.assertArrayEquals(new int[]{10}, SortsUtils.shake(new int[]{10}));
        Assertions.assertArrayEquals(new int[]{1,1,1,1}, SortsUtils.shake(new int[]{1,1,1,1}));
        Assertions.assertArrayEquals(new int[]{0,0,0,0}, SortsUtils.shake(new int[]{0,0,0,0}));

    }

    @DisplayName("Test shake with negative array")
    @Test
    public void shakeTest3() {
        Assertions.assertArrayEquals(new int[]{-6,-5,-4,-3,-2,-1}, SortsUtils.shake(new int[]{-1,-2,-3,-4,-5,-6}));
        Assertions.assertArrayEquals(new int[]{Integer.MIN_VALUE,-1,0,1,Integer.MAX_VALUE}, SortsUtils.shake(new int[]{Integer.MAX_VALUE,-1,0,1,Integer.MIN_VALUE}));
    }
}
