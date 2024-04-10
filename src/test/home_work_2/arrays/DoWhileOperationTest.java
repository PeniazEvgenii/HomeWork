package test.home_work_2.arrays;

import home_work_2.arrays.DoWhileOperation;
import home_work_2.arrays.IArraysOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    private IArraysOperation operation;

   @BeforeEach
   public void init(){
       operation = new DoWhileOperation();
   }

    @Test
   public void getArrayConsoleTest() {
       Assertions.assertEquals("9 1 5 99 9 9", operation.getArrayConsole(new int[]{9,1,5,99,9,9}));
       Assertions.assertEquals("1 2", operation.getArrayConsole(new int[]{1,2}));
       Assertions.assertEquals("", operation.getArrayConsole(new int[0]));
       Assertions.assertEquals("6 5 4 3 2 1", operation.getArrayConsole(new int[]{6,5,4,3,2,1}));
       Assertions.assertEquals("-1 -2 -3 -4 -5 -6", operation.getArrayConsole(new int[]{-1,-2,-3,-4,-5,-6}));
   }

   @Test
   public void getEachSecondTest() {
       Assertions.assertEquals("1 99 9", operation.getEachSecond(new int[]{9,1,5,99,9,9}));
       Assertions.assertEquals("", operation.getEachSecond(new int[]{1}));
       Assertions.assertEquals("", operation.getEachSecond(new int[0]));
       Assertions.assertEquals("5 3 1", operation.getEachSecond(new int[]{6,5,4,3,2,1}));
       Assertions.assertEquals("-2 -4 -6", operation.getEachSecond(new int[]{-1,-2,-3,-4,-5,-6}));

   }

   @Test
    public void getReverseArrayTest() {
       Assertions.assertEquals("9 9 99 5 1 9", operation.getReverseArray(new int[]{9,1,5,99,9,9}));
       Assertions.assertEquals("", operation.getReverseArray(new int[0]));
       Assertions.assertEquals("1 2 3 4 5 6", operation.getReverseArray(new int[]{6,5,4,3,2,1}));
       Assertions.assertEquals("-6 -5 -4 -3 -2 -1", operation.getReverseArray(new int[]{-1,-2,-3,-4,-5,-6}));

   }

}
