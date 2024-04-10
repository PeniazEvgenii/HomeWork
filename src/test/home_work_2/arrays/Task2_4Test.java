package test.home_work_2.arrays;

import home_work_2.arrays.Task2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class Task2_4Test {
    @DisplayName("Test1 getSumEvenPositive all positive")
    @Test
    public void getSumEvenPositiveTest() {
        int result = Task2_4.getSumEvenPositive(new int[]{1,2,3,4,5,6,Integer.MAX_VALUE});
        Assertions.assertEquals(12, result);
    }

    @DisplayName("Test2 getSumEvenPositive all number are the same")
    @Test
    public void getSumEvenPositiveTest1() {
        int result = Task2_4.getSumEvenPositive(new int[]{1,1,1,1,1,1});
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Test3 getSumEvenPositive empty array")
    @Test
    public void getSumEvenPositiveTest3() {
        int result = Task2_4.getSumEvenPositive(new int[0]);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("Test4 getSumEvenPositive array include negative number")
    @Test
    public void getSumEvenPositiveTest4() {
        int result = Task2_4.getSumEvenPositive(new int[]{-6,-5,-4,-3,2,1});
        Assertions.assertEquals(2, result);
    }

    @DisplayName("Test1 getMaxNumEvenIndex all positive")
    @Test
    public void getMaxNumEvenIndexTest1() {
        int result = Task2_4.getMaxNumEvenIndex(new int[]{1,2,3,4,5,6,Integer.MAX_VALUE});
        Assertions.assertEquals(Integer.MAX_VALUE, result);

        int result2 = Task2_4.getMaxNumEvenIndex(new int[]{6,5,4,3,2,1});
        Assertions.assertEquals(6, result2);
    }

    @DisplayName("Test2 getMaxNumEvenIndex all number are the same")
    @Test
    public void getMaxNumEvenIndexTest2() {
        int result = Task2_4.getMaxNumEvenIndex(new int[]{1,1,1,1,1,1});
        Assertions.assertEquals(1, result);
    }

    @DisplayName("Test3 getMaxNumEvenIndex array include negative number")
    @Test
    public void getMaxNumEvenIndexTest3() {
        int result = Task2_4.getMaxNumEvenIndex(new int[]{-6,-5,-4,-3,-2,-1});
        Assertions.assertEquals(-2, result);
    }

    @DisplayName("Test1 getElementBeforeAverage all positive")
    @Test
    public void getElementBeforeAverageTest1() {
        String result = Task2_4.getElementBeforeAverage(new int[]{1,2,3,4,5,6,7});
        Assertions.assertEquals("1 2 3", result);

        String result2 = Task2_4.getElementBeforeAverage(new int[]{9,1,5,99,9,9});
        Assertions.assertEquals("9 1 5 9 9", result2);
    }

    @DisplayName("Test2 getElementBeforeAverage array include negative number")
    @Test
    public void getElementBeforeAverageTest2() {
        String result = Task2_4.getElementBeforeAverage(new int[]{-1,-2,-3,-4,-5,-6,-7});
        Assertions.assertEquals("-5 -6 -7", result);
    }

    @DisplayName("Test3 getElementBeforeAverage with empty array")
    @Test
    public void getElementBeforeAverageTest3() {
        String result = Task2_4.getElementBeforeAverage(new int[0]);
        Assertions.assertEquals("", result);
    }

    @DisplayName("Test1 getMinTwoElementsTest all positive")
    @Test
    public void getMinTwoElementsTest1() {
        String result = Task2_4.getMinTwoElements(new int[]{1,2,3,4,5,6});
        Assertions.assertEquals("1 2", result);

        String result2 = Task2_4.getMinTwoElements(new int[]{9,1,5,99,9,9});
        Assertions.assertEquals("1 5", result2);
    }

    @DisplayName("Test2 getMinTwoElementsTest with negative array")
    @Test
    public void getMinTwoElementsTest2() {
        String result = Task2_4.getMinTwoElements(new int[]{Integer.MIN_VALUE,-100,1,2,100,Integer.MIN_VALUE});
        Assertions.assertEquals("-2147483648 -2147483648", result);
    }

    @DisplayName("Test3 getMinTwoElementsTest with empty array")
    @Test
    public void getMinTwoElementsTest3() {
        String result = Task2_4.getMinTwoElements(new int[0]);
        Assertions.assertEquals("-1", result);
    }

    @DisplayName("Test toSqueezeArray method")
    @Test
    public void toSqueezeArrayTest() {
        String result = Task2_4.toSqueezeArray(new int[]{1,2,3,4,5,6,7,8,9,10},3, 8);
        Assertions.assertEquals("1 2 9 10 0 0 0 0 0 0", result);

        String result2 = Task2_4.toSqueezeArray(new int[]{9,8,7,6,5,4,3,2,1},3, 8);
        Assertions.assertEquals("9 2 1 0 0 0 0 0 0", result2);

        String result3 = Task2_4.toSqueezeArray(new int[]{9,8,7,6,5,4,3,2,1},9, 9);
        Assertions.assertEquals("8 7 6 5 4 3 2 1 0", result3);

        String result4 = Task2_4.toSqueezeArray(new int[]{9,8,7,6,5,4,3,2,1},0, 1);
        Assertions.assertEquals("9 8 7 6 5 4 3 2 0", result4);
    }

    @DisplayName("Test2 toSqueezeArray with empty array")
    @Test
    public void toSqueezeArrayTest2() {
        String result2 = Task2_4.toSqueezeArray(new int[0],3, 8);
        Assertions.assertEquals("", result2);
    }

    @DisplayName("Test1 getSumDigitArray method use assertAll")
    @Test
    public void getSumDigitArrayTest1() {
        assertAll("test assertAll",
                () -> Assertions.assertEquals(15, Task2_4.getSumDigitArray(new int[]{1,2,3,4,5})),
                () -> Assertions.assertEquals(27, Task2_4.getSumDigitArray(new int[]{999})),
                () -> Assertions.assertEquals(11, Task2_4.getSumDigitArray(new int[]{111,11,1,11,111})),
                () -> Assertions.assertEquals(2, Task2_4.getSumDigitArray(new int[]{1,0,0,0,1}))
        );
    }

    @DisplayName("Test2 getSumDigitArray method empty array")
    @Test
    public void getSumDigitArrayTest2() {
       Assertions.assertEquals(0, Task2_4.getSumDigitArray(new int[0]));
    }
}
