package test.home_work_1;

import home_work_1.YearType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTypeTest {

    @Test
    public void isYearLeapTest() {
        Assertions.assertTrue(YearType.isYearLeap(2024));
        Assertions.assertTrue(YearType.isYearLeap(0));
        Assertions.assertTrue(YearType.isYearLeap(400));
        Assertions.assertFalse(YearType.isYearLeap(300));
    }
}
