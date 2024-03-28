package home_work_4.main;

import home_work_4.ComparatorForNumber;
import home_work_4.DataContainer;

import java.util.Arrays;

public class DataContainerIntegerMain {
    public static void main(String[] args) {
        Integer[] array = {};
        Integer[] array1 = {1, 2, 3, null, null, null};
        Integer[] array2 = {1, null, 3, null, null, null};

        DataContainer<Integer> container = new DataContainer<>(array);
        DataContainer<Integer> container1 = new DataContainer<>(array1);
        DataContainer<Integer> container2 = new DataContainer<>(array2);

        System.out.println(container);
        System.out.println("Добавлен элемент под индексом " + container.add(1600));
        System.out.println("Добавлен элемент под индексом " + container.add(777));
        System.out.println("Добавлен элемент под индексом " + container.add(5));
        System.out.println("Добавлен элемент под индексом " + container.add(55));
        System.out.println("Добавлен элемент под индексом " + container.add(99));
        System.out.println("Добавлен элемент под индексом " + container.add(888));
        System.out.println(container);

        System.out.println("Добавлен элемент под индексом " + container2.add(1600));
        System.out.println("Добавлен элемент под индексом " + container2.add(777));
        System.out.println("Добавлен элемент под индексом " + container2.add(5));
        System.out.println("Добавлен элемент под индексом " + container2.add(55));
        System.out.println("Добавлен элемент под индексом " + container2.add(99));
        System.out.println("Добавлен элемент под индексом " + container2.add(888));
        System.out.println(container2);

        System.out.println("Получение элементов по индексу");
        System.out.println("Элемент с индексом 1 = " + container2.get(1));
        System.out.println("Элемент с индексом 5 = " + container2.get(5));
        System.out.println("Элемент с индексом 100 = " + container2.get(100));

        Integer[] arrayNew = container2.getItems();
        System.out.println("Получен из сontainer2 " + Arrays.toString(arrayNew));


        System.out.println("\nУдаление элементов по индексу");
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete(0));
        System.out.println(container.delete(4));
        System.out.println(container.delete(5));
        System.out.println("После удаления элементов " + container);

        System.out.println("\nУдаление элементов по значению");
        container.add(59);
        container.add(4444);
        container.add(55445);
        container.add(5523);
        container.add(5522);
        container.add(1111);
        container.add(15111);
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete(Integer.valueOf(4444)));
        System.out.println(container.delete(Integer.valueOf(5)));
        System.out.println(container.delete(Integer.valueOf(15111)));
        System.out.println(container.delete(Integer.valueOf(1000_000_000)));
        System.out.println("После удаления элементов " + container);

        ComparatorForNumber comparatorForNumber = new ComparatorForNumber();
        container.sort(comparatorForNumber);
        System.out.println("После сортировки элементов " + container);

    }
}
