package home_work_5.utils;

import java.util.*;
import java.util.stream.Collectors;

public class OperationsOfCollect {

    public static<T> String operationsOfCollect(Collection<T> collect, Comparator<? super T> comparator) {
        StringBuilder result = new StringBuilder();

        long start1 = System.currentTimeMillis();
        List<T> list = sortWithStream(collect);
        long end1 = System.currentTimeMillis();
        result.append(getStringResult("Сортировка по одному полю", end1 - start1));

        long start2 = System.currentTimeMillis();
        List<T> list1 = sortWithStreamComparator(collect, comparator);
        long end2 = System.currentTimeMillis();
        result.append(getStringResult("Сортировка по двум полям", end2 - start2));

        long result3 = getTimeIterator(collect);
        result.append(getStringResult("Итерирование", result3));

        long result4 = clearCollection(collect);
        result.append(getStringResult("Удаление элементов итератором", result4));

        return result.toString();
    }


    /**
     * Метод вывода результирующей строки
     * @param nameOperation строка с именем операции
     * @param result время выполнения операции
     * @return отформатированная строка
     */
    public static String getStringResult(String nameOperation, long result) {
        return String.format("Операция: %s. Заняла %d мс%n", nameOperation,result);
    }


    /**
     * Метод сортировки коллекции в stream()
     * @param collects коллекция
     * @return время сортировки
     */
    public static<T> List<T> sortWithStream(Collection<T> collects) {
        return collects.stream()
                .sorted()
                .collect(Collectors.toList());
    }


    /**
     * Метод сортировки коллекции в stream() переданным компоратором
     * @param collects коллекция
     * @param comparator компаратор
     * @return время сортировки
     */
    public static<T> List<T> sortWithStreamComparator(Collection<T> collects, Comparator<? super T> comparator) {
        return collects.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }


    /**
     * метод очистки коллекции итератором
     * @param collect коллекция
     * @return время очисчтки коллекции
     */
    public static<T> long clearCollection(Collection<T> collect) {
        Iterator<T> iterator1 = collect.iterator();
        T t;
        long start = System.currentTimeMillis();
        while (iterator1.hasNext()){
            t = iterator1.next();
            iterator1.remove();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * метод итерирования коллекции
     * @param collects коллекция
     * @return время итерирования
     */
    public static<T> long getTimeIterator(Collection<T> collects) {
        Iterator<T> iterator = collects.iterator();
        long start = System.currentTimeMillis();
        T t;
        while (iterator.hasNext()){
            t = iterator.next();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * метод итерирования коллекции List с помощью for(;;)
     * @param collects коллекция
     * @return время итерирования
     */
    public static<T> long getTimeIteratorFor(List<T> collects) {
        long start = System.currentTimeMillis();
        int size = collects.size();
        T t;
        for(int i = 0; i < size; i++) {
            t = collects.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}
