package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriorityTest {

    @Test
    public void expression2_1Test() {
        Assertions.assertEquals(5, 5 + 2 / 8);
    }

    @Test
    public void expression2_2Test() {
        Assertions.assertEquals(0, (5 + 2)/8);
    }

    @Test
    public void expression2_3Test() {
        int a = 2;
        Assertions.assertEquals(0, (5 + a++) / 8);
    }

    @Test
    public void expression2_4Test() {
        int a = 2;
        int b = 8;
        Assertions.assertEquals(1, (5 + a++) / --b);
    }

    @Test
    public void expression2_5Test() {
        int a = 2;
        int b = 8;
        Assertions.assertEquals(0, (5 * 2 >> a++) / --b);
    }

    @Test
    public void expression2_6Test() {
        int a = 2;
        int b = 8;
        Assertions.assertEquals(1, (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b);
    }

    @Test
    public void expression2_7Test() {
        Assertions.assertFalse((6 - 2 > 3 && 12 * 12 <= 119));
    }

    @Test
    public void expression2_8Test() {
        Assertions.assertFalse(true && false);
    }
}
