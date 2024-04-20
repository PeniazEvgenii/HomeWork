package home_work_5.utils;

import java.util.*;

public class SortCollection {


    /**
     * метод сортировки коллекции
     * @param collection коллекция
     * @param comparator компаратор
     * @param <T>
     */
    public static <T> void sort (Collection<T> collection, Comparator<? super T> comparator) {
        List<T> list = new ArrayList<>(collection);
        int left = 0;
        int right = list.size() - 1;
        int flag = 1;
        while(left < right && flag != 0) {
            flag = 0;

            for (int i = left; i < right; i++) {
                if(comparator.compare(list.get(i), list.get(i + 1)) > 0){
                    swapElement(list, i, i + 1);
                    flag = 1;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if(comparator.compare(list.get(i), list.get(i - 1)) < 0){
                    swapElement(list, i, i - 1);
                    flag = 1;
                }
            }
            left++;
        }
        collection.clear();
        collection.addAll(list);
    }

    private static <T> void swapElement(List<T> list, int e1, int e2) {
        T temp = list.get(e1);
        list.set(e1, list.get(e2));
        list.set(e2, temp);
    }
}
