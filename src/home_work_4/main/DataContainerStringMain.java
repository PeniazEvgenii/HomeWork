package home_work_4.main;

import home_work_4.ComparatorForStringLength;
import home_work_4.ComparatorForStringValue;
import home_work_4.DataContainer;

import java.util.Arrays;

public class DataContainerStringMain {
    public static void main(String[] args) {
        String[] array = {"1.5", null, "привет", null, null, null};

        DataContainer<String> container = new DataContainer<>(array);
    /*
     *  Scanner console = new Scanner(System.in);
     *  String text = "";
     *  do {
     *      System.out.println("Введите строку для добавления в container. Для окончания ввода ввести exit");
     *      text = console.nextLine();
     *      if(!isCheckExit(text)) {
     *          System.out.println("Добавлен элемент под индексом " + container.add(text));
     *      }
     *  } while (!isCheckExit(text));
     */
        System.out.println("Добавлен элемент под индексом " + container.add("я"));
        System.out.println("Добавлен элемент под индексом " + container.add("777.34332"));
        System.out.println("Добавлен элемент под индексом " + container.add("изучаю"));
        System.out.println("Добавлен элемент под индексом " + container.add("JAVA"));
        System.out.println("Добавлен элемент под индексом " + container.add("i"));
        System.out.println("Добавлен элемент под индексом " + container.add("hello"));
        System.out.println("Добавлен элемент под индексом " + container.add("Как домашка"));
        System.out.println("Добавлен элемент под индексом " + container.add("метод"));
        System.out.println("Добавлен элемент под индексом " + container.add("data"));
        System.out.println("Добавлен элемент под индексом " + container.add("hell"));
        System.out.println("Добавлен элемент под индексом " + container.add("hello"));
        System.out.println("Добавлен элемент под индексом " + container.add("umberrrrrr"));
        System.out.println("Добавлен элемент под индексом " + container.add("55.2"));

        System.out.println(container);

        System.out.println("Получение элементов по индексу");
        System.out.println(container.get(1));
        System.out.println(container.get(5));
        System.out.println(container.get(100));

        String[] arrayNew = container.getItems();
        System.out.println("Получен из сontainer " + Arrays.toString(arrayNew));

        System.out.println("\nУдаление элементов по индексу");
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete(0));
        System.out.println(container.delete(4));
        System.out.println(container.delete(100));
        System.out.println("После удаления элементов " + container);

        System.out.println("\nУдаление элементов по значению");
        System.out.println("до удаления элементов " + container);
        System.out.println(container.delete("я"));
        System.out.println(container.delete("изучаю"));
        System.out.println(container.delete("Как домашка"));
        System.out.println("После удаления элементов " + container);

        ComparatorForStringLength comparatorForStringLength = new ComparatorForStringLength();
        container.sort(comparatorForStringLength);
        System.out.println("\nПосле сортировки элементов по длине " + container);

        ComparatorForStringValue comparatorForValue = new ComparatorForStringValue();
        container.sort(comparatorForValue);
        System.out.println("После сортировки элементов по имени " + container);

        System.out.println("\nсортировка статическим методом sort(DataContainer<T> container)");
        container.sort(comparatorForStringLength);
        System.out.println("До сортировки элементов " + container);
        DataContainer.sort(container);
        System.out.println("После сортировки элементов " + container);

        System.out.println("\nПроверка массива for-each");
        for (String s : container) {
            System.out.print(s + " | ");
        }
    }

    public static boolean isCheckExit(String text) {
        return "exit".equals(text);
    }
}
