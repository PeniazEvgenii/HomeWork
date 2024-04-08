package test.home_work_2.loops;

import home_work_2.loops.Task1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1_5Test {

    @Test
    public void getMaxDigitTest() {
        Assertions.assertEquals(9, Task1_5.getMaxDigit(123456789));
        Assertions.assertEquals(1, Task1_5.getMaxDigit(1));
        Assertions.assertEquals(9, Task1_5.getMaxDigit(9999));
    }

    @DisplayName("Test getMaxDigit method with not real(row) and zero numbers")
    @Test
    public void getMaxDigitTest2() {
        Assertions.assertEquals(-1, Task1_5.getMaxDigit(Integer.MIN_VALUE));
        Assertions.assertEquals(-1, Task1_5.getMaxDigit(0));
    }

    @Test
    public void checkRandomGeneratorTest() {
        double result = Task1_5.checkRandomGenerator(10_000);
        if(result > 100 || result < 0) {
            Assertions.fail("result have to within 0% to 100% range");
        }
    }

    @Test
    public void countEvenDigitTest() {
        Assertions.assertEquals(4, Task1_5.countEvenDigit(123456789));
        Assertions.assertEquals(0, Task1_5.countEvenDigit(111333555));
    }

    @DisplayName("Test countEvenDigit method with not real(row) and zero numbers")
    @Test
    public void countEvenDigitTest2() {
        Assertions.assertEquals(-1, Task1_5.countEvenDigit(0));
        Assertions.assertEquals(-1, Task1_5.countEvenDigit(Integer.MIN_VALUE));
    }

    @Test
    public void countOddDigitTest() {
        Assertions.assertEquals(7, Task1_5.countOddDigit(1111111));
        Assertions.assertEquals(1, Task1_5.countOddDigit(9));
        Assertions.assertEquals(0, Task1_5.countOddDigit(222444666));
    }

    @DisplayName("Test countEvenDigit method with not real(row) and zero numbers")
    @Test
    public void countOddDigitTest2() {
        Assertions.assertEquals(-1, Task1_5.countOddDigit(0));
        Assertions.assertEquals(-1, Task1_5.countOddDigit(Integer.MIN_VALUE));
    }

    @Test
    public void fibonacciTest() {
        int[] result = Task1_5.fibonacci(20);
        int[] expectedResult = {1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946};
        Assertions.assertArrayEquals(expectedResult, result);

        Assertions.assertArrayEquals(new int[]{1},Task1_5.fibonacci(1));
    }

    @Test
    public void getRowOfNumbersTest() {
        int[] result = Task1_5.getRowOfNumbers(1, 33, 3);
        int[] expectedResult = {1,4,7,10,13,16,19,22,25,28,31};
        Assertions.assertArrayEquals(expectedResult, result);

        int[] result1 = Task1_5.getRowOfNumbers(1, 1, 5);
        int[] expectedResult1 = {1};
        Assertions.assertArrayEquals(expectedResult1, result1);
    }

    @Test
    public void toNumberReverseTest() {
        Assertions.assertEquals(987654321, Task1_5.toNumberReverse(123456789));
        Assertions.assertEquals(1, Task1_5.toNumberReverse(1));
        Assertions.assertEquals(-1, Task1_5.toNumberReverse(Long.MIN_VALUE));
    }

    @DisplayName("Test the second version toNumberReverse without String")
    @Test
    public void toNumberReverseWithoutStringTest() {
        Assertions.assertEquals(987654321, Task1_5.toNumberReverseWithoutString(123456789));
        Assertions.assertEquals(1, Task1_5.toNumberReverseWithoutString(1));
        Assertions.assertEquals(-1, Task1_5.toNumberReverseWithoutString(Long.MIN_VALUE));
    }

}



