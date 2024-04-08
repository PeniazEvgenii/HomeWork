package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public String getArrayConsole(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if(i != array.length - 1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String getEachSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                if(stringBuilder.length() == 0){
                    stringBuilder.append(array[i]);
                } else {
                    stringBuilder.append(" ").append(array[i]);
                }
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String getReverseArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if(stringBuilder.length() == 0){
                stringBuilder.append(array[i]);
            } else {
                stringBuilder.append(" ").append(array[i]);
            }
        }
        return stringBuilder.toString();
    }
}
