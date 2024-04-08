package test.home_work_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static home_work_1.NumberDivision.getResultDivision;

public class NumberDivisionTest {
    @Test
    public void getResultDivisionTest() {
        Assertions.assertTrue(getResultDivision(1000,5));
        Assertions.assertTrue(getResultDivision(1,1));
        Assertions.assertTrue(getResultDivision(Integer.MIN_VALUE,2));
        Assertions.assertFalse(getResultDivision(Integer.MAX_VALUE,2));
        Assertions.assertFalse(getResultDivision(Integer.MAX_VALUE,0));

    }
}
