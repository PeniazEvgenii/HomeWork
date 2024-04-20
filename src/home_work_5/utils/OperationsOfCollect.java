package home_work_5.utils;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

public class OperationsOfCollect {

    public static<T> String operationsOfCollect(Collection<T> collect, Comparator<? super T> comparator) {
        StringBuilder result = new StringBuilder();

        long result1 = sortWithStream(collect);
        result.append(getStringResult("Сортировка", result1));

        long result2 = sortWithStreamComparator(collect, comparator);
        result.append(getStringResult("Сортировка comparator", result2));

        Iterator<T> iterator = collect.iterator();
        long start3 = System.currentTimeMillis();
        T t;
        while (iterator.hasNext()){
            t = iterator.next();
        }
        long end3 = System.currentTimeMillis();
        result.append(getStringResult("Итерирование", end3 - start3));


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
     * @param collect коллекция
     * @return время сортировки
     */
    public static<T> long sortWithStream(Collection<T> collect) {
        long start = System.currentTimeMillis();
        collect.stream()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Метод сортировки коллекции в stream() переданным компоратором
     * @param collect коллекция
     * @param comparator компаратор
     * @return время сортировки
     */
    public static<T> long sortWithStreamComparator(Collection<T> collect, Comparator<? super T> comparator) {
        long start = System.currentTimeMillis();
        collect.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        return end - start;
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
}
