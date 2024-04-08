package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{

    @Override
    public String getArrayConsole(int[] array) {
        if(array.length == 0){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        do {
            stringBuilder.append(array[index]);
            if(index != array.length - 1){
                stringBuilder.append(" ");
            }
            index++;
        } while (index < array.length);
        return stringBuilder.toString();
    }

    @Override
    public String getEachSecond(int[] array) {
        if(array.length == 0){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        do {
            if (index % 2 != 0) {
                if(stringBuilder.length() == 0){
                    stringBuilder.append(array[index]);
                } else {
                    stringBuilder.append(" ").append(array[index]);
                }
            }
            index++;
        } while (index < array.length);
        return stringBuilder.toString();
    }

    @Override
    public String getReverseArray(int[] array) {
        if(array.length == 0){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int index = array.length - 1;
        do {
            stringBuilder.append(array[index]);
            if(index != 0){
                stringBuilder.append(" ");
            }
            index--;
        } while (index >= 0);
        return stringBuilder.toString();
    }
}
