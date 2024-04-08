package test.home_work_2.loops;

import home_work_2.loops.Task1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_3Test {

    @Test
    public void getPowerOfNumberTest1() {
        double result = Task1_3.getPowerOfNumber(7.5, 2);
        Assertions.assertEquals(56.25, result);
    }

    @Test
    public void getPowerOfNumberTest2() {
        double result = Task1_3.getPowerOfNumber(Integer.MAX_VALUE, 0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void getPowerOfNumberTest3() {
        double result = Task1_3.getPowerOfNumber(18.22, 5);
        Assertions.assertEquals(2007898.9988, result,0.0001);
    }

    @Test
    public void getPowerOfNumberTest4() {
        double result = Task1_3.getPowerOfNumber(Integer.MAX_VALUE, 2);
        Assertions.assertEquals(4611686014132420609L, result);
    }
}
