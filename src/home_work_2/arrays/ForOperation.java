package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public void getArrayConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void getEachSecond(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    @Override
    public void getReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
