package home_work_2.utils;
/* 2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
*   2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
*       запрашивает у пользователя через консоль.
*
*   2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два аргумента.
*       Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого
*       числа генерировать рандомные числа.
*/

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static final int MIN_SIZE_ARRAY = 0;

    /**
     * Метод заполнения массива с консоли
     * @return массив со значениями
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        boolean checkInputSize;
        int size;

        do {
            System.out.println("Введи размер массива");
            size = console.nextInt();
            checkInputSize = size < MIN_SIZE_ARRAY;
            if (checkInputSize) {
                System.out.println("Неверный задан размер массива. Введите значение от " + MIN_SIZE_ARRAY);
            }
        } while (checkInputSize);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введи значение " + i + " элемента");
            array[i] = console.nextInt();
        }
        return array;
    }


    /**
     * Метод заполнения массива рандомными числами
     * @param size размер массиа
     * @param maxValueExclusion предел диапазона генерирования рандомных чисел
     * @return массив со значениями, пустой массив если задан размер меньше 0 и диапазон меньше 1
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        if(size < MIN_SIZE_ARRAY || maxValueExclusion < 1) {
            //System.out.println("Ошибка. Указан размер меньше 0 либо диапазон случайных чисел меньше 1");
            return new int[]{};
        }

        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }
        return array;
    }

}
