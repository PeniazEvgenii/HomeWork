package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void getArrayConsole(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void getEachSecond(int[] array) {
        int index = 0;
        for (int i : array) {
            if (index % 2 != 0){
                System.out.print(i + " ");
            }
            index++;
        }
    }

    @Override
    public void getReverseArray(int[] array) {
        String temp ="";
        for (int i : array) {
            temp = i + " " + temp;
        }
        System.out.println(temp);
    }
}
