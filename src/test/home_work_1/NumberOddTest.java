package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static home_work_1.NumberOdd.checkNumberOdd;

public class NumberOddTest {

    @Test
    public void checkNumberOddTest() {
        Assertions.assertEquals(Integer.MAX_VALUE, checkNumberOdd(2, Integer.MAX_VALUE));
        Assertions.assertEquals(Integer.MAX_VALUE, checkNumberOdd(0, Integer.MAX_VALUE));
        Assertions.assertEquals(1, checkNumberOdd(1, 2));
    }
}
