package test.home_work_2.loops;

import home_work_2.loops.Task1_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_4Test {

    @Test
    public void getNumberBeforeOverflowTest1() {
       long result = Task1_4.getNumberBeforeOverflow(2);
        Assertions.assertEquals(4_611_686_018_427_387_904L, result);
    }
    @Test
    public void getNumberBeforeOverflowTest2() {
        long result = Task1_4.getNumberBeforeOverflow(Integer.MAX_VALUE);
        Assertions.assertEquals(4_611_686_014_132_420_609L, result);
    }

    @Test
    public void getNumberBeforeOverflowTest3() {
        long result = Task1_4.getNumberBeforeOverflow(-19);
        Assertions.assertEquals(799_006_685_782_884_121L, result);
    }
}
