package test.home_work_2.loops;

import home_work_2.loops.Task1_1Recurs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1_1RecursTest {

    @DisplayName("Test of recurs method only math")
    @Test
    public void recursTest() {
        long result1 = Task1_1Recurs.recurs(5L);
        Assertions.assertEquals(120, result1);

        long result2 = Task1_1Recurs.recurs(20L);
        Assertions.assertEquals(2432902008176640000L, result2);

        long result3 = Task1_1Recurs.recurs(1L);
        Assertions.assertEquals(1, result3);
    }

    @DisplayName("Test of recursResult method from condition")
    @Test
    public void recursResultTaskTest() {
        String result = Task1_1Recurs.recursResult(5L, Task1_1Recurs.recurs(5L));
        String expectedResult = "1 * 2 * 3 * 4 * 5 = 120";
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test of recursResult method with max number before overflow")
    @Test
    public void recursResultMaxNumberTest() {
        String result = Task1_1Recurs.recursResult(20L, Task1_1Recurs.recurs(20L));
        String expectedResult = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 = 2432902008176640000";
        Assertions.assertEquals(expectedResult, result);
    }


    @DisplayName("Test of recursResult method with one")
    @Test
    public void recursResultOneTest() {
        String result = Task1_1Recurs.recursResult(1L, Task1_1Recurs.recurs(1L));
        String expectedResult = "1 = 1";
        Assertions.assertEquals(expectedResult, result);
    }
}
