package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public void getArrayConsole(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.print(array[index] + " ");
            index++;
        }
    }

    @Override
    public void getEachSecond(int[] array) {
        int index = 0;
        while (index < array.length) {
            if (index % 2 != 0){
                System.out.print(array[index] + " ");
            }
            index++;
        }
    }

    @Override
    public void getReverseArray(int[] array) {
        int index = array.length - 1;
        while (index >= 0){
            System.out.print(array[index] + " ");
            index--;
        }
    }
}
