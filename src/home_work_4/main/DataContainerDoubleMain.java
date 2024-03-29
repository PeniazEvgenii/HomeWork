package home_work_4.main;

import home_work_4.ComparatorForNumber;
import home_work_4.DataContainer;

import java.util.Arrays;

public class DataContainerDoubleMain {
    public static void main(String[] args) {
        Double[] array = {1.5, null, 34.2, null, null, null};

        DataContainer<Double> container = new DataContainer<>(array);
        System.out.println(container);

        System.out.println("Добавлен элемент под индексом " + container.add(160.1));
        System.out.println("Добавлен элемент под индексом " + container.add(777.34));
        System.out.println("Добавлен элемент под индексом " + container.add(5d));
        System.out.println("Добавлен элемент под индексом " + container.add(55.5));
        System.out.println("Добавлен элемент под индексом " + container.add(99.99));
        System.out.println("Добавлен элемент под индексом " + container.add(888.1));
        System.out.println("Добавлен элемент под индексом " + container.add(160.1));
        System.out.println("Добавлен элемент под индексом " + container.add(777.34));
        System.out.println("Добавлен элемент под индексом " + container.add(533.11));
        System.out.println("Добавлен элемент под индексом " + container.add(55.1));
        System.out.println("Добавлен элемент под индексом " + container.add(154.0));
        System.out.println("Добавлен элемент под индексом " + container.add(889.1));
        System.out.println("Добавлен элемент под индексом " + container.add(55.2));

        System.out.println(container);

        System.out.println("Получение элементов по индексу");
        System.out.println(container.get(1));
        System.out.println(container.get(5));
        System.out.println(container.get(100));

        System.out.println("Получен из сontainer " + Arrays.toString(container.getItems()));

        System.out.println("\nУдаление элементов по индексу");
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete(0));
        System.out.println(container.delete(4));
        System.out.println(container.delete(5));
        System.out.println("После удаления элементов " + container);

        System.out.println("\nУдаление элементов по значению");
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete(777.34));
        System.out.println(container.delete(533.11));
        System.out.println(container.delete(55.1));
        System.out.println("После удаления элементов " + container);

        ComparatorForNumber comparatorForNumber = new ComparatorForNumber();

        /*
         *   System.out.println("До сортировки элементов " + container);
         *   container.sort(comparatorForNumber);
         *   System.out.println("После сортировки элементов " + container);
         */

        /*
         * System.out.println("сортировка статическим методом sort(DataContainer<T> container)");
         * System.out.println("До сортировки элементов " + container);
         * DataContainer.sort(container);
         * System.out.println("После сортировки элементов " + container);
         */

        System.out.println("\nсортировка статическим методом DataContainer<T> container, Comparator<? super T> comparator");
        System.out.println("До сортировки элементов " + container);
        DataContainer.sort(container, comparatorForNumber);
        System.out.println("После сортировки элементов " + container);

        System.out.println("Проверка for-each интерфейса Iterable");
        for (Double cont : container) {
            System.out.print(cont + " | ");
        }
    }

}
