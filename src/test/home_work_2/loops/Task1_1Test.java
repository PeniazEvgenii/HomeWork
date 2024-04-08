package test.home_work_2.loops;

import home_work_2.loops.Task1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1_1Test {

    @DisplayName("Test of factorial method only math")
    @Test
    public void factorialTest() {
        long result1 = Task1_1.factorial(5L);
        Assertions.assertEquals(120, result1);

        long result2 = Task1_1.factorial(20L);
        Assertions.assertEquals(2432902008176640000L, result2);

        long result3 = Task1_1.factorial(1L);
        Assertions.assertEquals(1, result3);

        // учтено переполнение после 20
        long result4 = Task1_1.factorial(21L);
        Assertions.assertEquals(-1, result4);
    }

    @DisplayName("Test of factorialResult method from condition")
    @Test
    public void factorialResultTaskTest() {
        String result = Task1_1.factorialResult(5L, Task1_1.factorial(5L));
        String expectedResult = "1 * 2 * 3 * 4 * 5 = 120";
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test of factorialResult method with max number before overflow")
    @Test
    public void factorialResultTest() {
        String result = Task1_1.factorialResult(20L, Task1_1.factorial(20L));
        String expectedResult = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 = 2432902008176640000";
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test of factorialResult method with one")
    @Test
    public void factorialResultOneTest() {
        String result = Task1_1.factorialResult(1L, Task1_1.factorial(1L));
        String expectedResult = "1 = 1";
        Assertions.assertEquals(expectedResult, result);
    }
}
