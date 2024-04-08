package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public String getArrayConsole(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < array.length) {
            stringBuilder.append(array[index]);
            if(index != array.length - 1){
                stringBuilder.append(" ");
            }
            index++;
        }
        return stringBuilder.toString();
    }

    @Override
    public String getEachSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < array.length) {
            if (index % 2 != 0){
                if(stringBuilder.length() == 0){
                    stringBuilder.append(array[index]);
                } else {
                    stringBuilder.append(" ").append(array[index]);
                }
            }
            index++;
        }
        return stringBuilder.toString();
    }

    @Override
    public String getReverseArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = array.length - 1;
        while (index >= 0){
            stringBuilder.append(array[index]);
            if(index != 0){
                stringBuilder.append(" ");
            }
            index--;
        }
        return stringBuilder.toString();
    }

}
