package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;


public class DoWhileOperation implements IArraysOperation{

    @Override
    public void getArrayConsole(int[] array) {
        int index = 0;
        do {
            System.out.print(array[index] + " ");
            index++;
        } while (index < array.length);
    }

    @Override
    public void getEachSecond(int[] array) {
        int index = 0;
        do {
            if (index % 2 != 0) {
                System.out.print(array[index] + " ");
            }
            index++;
        } while (index < array.length);
    }

    @Override
    public void getReverseArray(int[] array) {
        int index = array.length - 1;
        do {
            System.out.print(array[index] + " ");
            index--;
        } while (index >= 0);
    }

    public static void main(String[] args) {
        int[] test = ArraysUtils.arrayRandom(50,100);
        DoWhileOperation proba = new DoWhileOperation();

        proba.getArrayConsole(test);
        System.out.println();
        proba.getEachSecond(test);
        System.out.println();
        proba.getReverseArray(test);
    }
}
