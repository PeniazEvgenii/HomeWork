package test.home_work_2.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysUtilsTest {

    @DisplayName("Test check length of array")
    @Test
    public void arrayRandomTest1() {
        int[] test = ArraysUtils.arrayRandom(10, 10);
        if (test.length != 10) {
            Assertions.fail("invalid array length");
        }
    }

    @DisplayName("Test check values of array")
    @Test
    public void arrayRandomTest2() {
        int[] test = ArraysUtils.arrayRandom(1000, 50);
        for (int i : test) {
            if (i < 0 || i >= 50) {
                Assertions.fail("invalid value from range");
            }
        }
    }
}
