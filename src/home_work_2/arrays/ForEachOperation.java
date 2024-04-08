package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String getArrayConsole(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (int i : array) {
            if(first){
                stringBuilder.append(i);
                first = false;
                continue;
            }
            stringBuilder.append(" ").append(i);
        }
        return stringBuilder.toString();
    }

    @Override
    public String getEachSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        boolean first = true;
        for (int i : array) {
            if (index % 2 != 0){
                if(first){
                    stringBuilder.append(i);
                    first = false;
                    index++;
                    continue;
                }
                stringBuilder.append(" ").append(i);
            }
            index++;
        }
        return stringBuilder.toString();
    }

    @Override
    public String getReverseArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (int i : array) {
            if(first){
                stringBuilder.insert(0, i);
                first = false;
                continue;
            }
            stringBuilder.insert(0, " ").insert(0, i);
        }
        return stringBuilder.toString();
    }
}
