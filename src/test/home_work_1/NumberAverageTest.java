package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.NumberAverage.average;

public class NumberAverageTest {

    @Test
    public void averageEqualNumbersTest() {
        Assertions.assertEquals(0, average(0, 0, 0));
        Assertions.assertEquals(Integer.MAX_VALUE, average(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void averageDifferNumbersTest() {
        Assertions.assertEquals(100, average(0, Integer.MAX_VALUE, 100));
        Assertions.assertEquals(98, average(98, 111, 15));
    }
}
