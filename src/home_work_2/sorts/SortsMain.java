package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

/*
4.2. Создать класс SortsMain. Все проверки пишутся в main.
    4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
     Для преобразования массива в текст можно использовать класс Arrays.
    4.2.2. Для тестов используем предварительно созданные массивы:
        4.2.2.1. new int[]{1,2,3,4,5,6}
        4.2.2.2. new int[]{1,1,1,1}
        4.2.2.3. new int[]{9,1,5,99,9,9}
        4.2.2.4. new int[]{}
        4.2.2.5. new int[]{6,5,4,3,2,1}
    4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива. Вызывая ранее созданный метод arrayRandom
    (ArraysUtils.arrayRandom(50, 100))получить массив. Отсортировать.
    4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль. Вызывая ранее созданный
    метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
*/

public class SortsMain {
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] test2 = new int[]{1, 1, 1, 1};
        int[] test3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] test4 = new int[]{};
        int[] test5 = new int[]{6, 5, 4, 3, 2, 1};

        String strTest1 = Arrays.toString(test1) + " -> ";
        String strTest2 = Arrays.toString(test2) + " -> ";
        String strTest3 = Arrays.toString(test3) + " -> ";
        String strTest4 = Arrays.toString(test4) + " -> ";
        String strTest5 = Arrays.toString(test5) + " -> ";

        SortsUtils.shake(test1);
        SortsUtils.shake(test2);
        SortsUtils.sort(test3);
        SortsUtils.sort(test4);
        SortsUtils.shake(test5);

        System.out.println(strTest1 + Arrays.toString(test1));
        System.out.println(strTest2 + Arrays.toString(test2));
        System.out.println(strTest3 + Arrays.toString(test3));
        System.out.println(strTest4 + Arrays.toString(test4));
        System.out.println(strTest5 + Arrays.toString(test5));

        System.out.println();

        System.out.println("Сортировка пузырьком рандомного массива");
        int[] testBubble1 = ArraysUtils.arrayRandom(50,100);
        String testBubbleSort1 = Arrays.toString(testBubble1) + " -> \n";
        SortsUtils.sort(testBubble1);
        System.out.println(testBubbleSort1 + Arrays.toString(testBubble1));

        System.out.println("Сортировка пузырьком массива с консоли");
        int[] testBubble2 = ArraysUtils.arrayFromConsole();
        String testBubbleSort2 = Arrays.toString(testBubble2) + " -> ";
        SortsUtils.sort(testBubble2);
        System.out.println(testBubbleSort2 + Arrays.toString(testBubble2));

        System.out.println();

        System.out.println("Шейкерная сортировка рандомного массива");
        int[] testShaker1 = ArraysUtils.arrayRandom(50,100);
        String testShakeSort1 = Arrays.toString(testShaker1) + " -> \n";
        SortsUtils.shake(testShaker1);
        System.out.println(testShakeSort1 + Arrays.toString(testShaker1));

        System.out.println("Шейкерная сортировка массива с консоли");
        int[] testShaker2 = ArraysUtils.arrayFromConsole();
        String testShakeSort2 = Arrays.toString(testShaker2) +  " -> ";
        SortsUtils.shake(testShaker2);
        System.out.println(testShakeSort2 + Arrays.toString(testShaker2));
    }
}
