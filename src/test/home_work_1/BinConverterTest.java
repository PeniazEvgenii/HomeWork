package test.home_work_1;

import home_work_1.BinConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinConverterTest {

    @Test
    public void BinConverterMaxValueTest() {
        String result = BinConverter.toBinaryString(Byte.MAX_VALUE);
        String expectedResult = "01111111";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void BinConverterMinValueTest() {
        String result = BinConverter.toBinaryString(Byte.MIN_VALUE);
        String expectedResult = "10000000";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void BinConverterZeroValueTest() {
        String result = BinConverter.toBinaryString((byte) 0);
        String expectedResult = "00000000";
        Assertions.assertEquals(expectedResult, result);
    }
}
