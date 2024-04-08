package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Converter.byteToKilobyteConverter;
import static home_work_1.Converter.kilobyteToByteConverter;

public class ConverterTest {

    @Test
    public void byteToKilobyteConverterMaxValueTest() {
        double result = byteToKilobyteConverter(Integer.MAX_VALUE);
        double expectedResult = 2097151.9990234375;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void byteToKilobyteConverterZeroTest() {
        double result = byteToKilobyteConverter(0);
        double expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void KilobyteToByteConverterZeroTest() {
        double result = kilobyteToByteConverter(0);
        double expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void KilobyteToByteConverterMaxValueTest() {
        double result = kilobyteToByteConverter(Integer.MAX_VALUE);
        double expectedResult = 2199023254528.0;
        Assertions.assertEquals(expectedResult, result);
    }
}
