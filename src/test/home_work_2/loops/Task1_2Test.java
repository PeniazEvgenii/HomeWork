package test.home_work_2.loops;

import home_work_2.loops.Task1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1_2Test {

    @DisplayName("Test of getDigitMultiplication method only math")
    @Test
    public void getDigitMultiplicationTest() {
        long result = Task1_2.getDigitMultiplacation(181_232_375L);
        Assertions.assertEquals(10_080L, result);

        long result2 = Task1_2.getDigitMultiplacation(11_111_111_111L);
        Assertions.assertEquals(1L, result2);

        long result3 = Task1_2.getDigitMultiplacation(1_234_567_891L);
        Assertions.assertEquals(362_880L, result3);
    }

    @DisplayName("Test of printDigitMultiplacationTest method")
    @Test
    public void printDigitMultiplacationTest() {
        String result = Task1_2.printDigitMultiplacation(181_232_375L,Task1_2.getDigitMultiplacation(181_232_375L));
        String expectedResult = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080";
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test of printDigitMultiplacationTest with number with one digit")
    @Test
    public void printDigitMultiplacationOneDigitTest() {
        String result = Task1_2.printDigitMultiplacation(1L,Task1_2.getDigitMultiplacation(1L));
        String expectedResult = "1 = 1";
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test of printDigitMultiplacationTest with number includes zero")
    @Test
    public void printDigitMultiplacationZeroTest() {
        String result = Task1_2.printDigitMultiplacation(10001L,Task1_2.getDigitMultiplacation(10001L));
        String expectedResult = "1 * 0 * 0 * 0 * 1 = 0";
        Assertions.assertEquals(expectedResult, result);
    }
}
