package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

/*
 * 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom
 *       будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

public class ArrayExampleRandom {
    public static void main(String[] args) {
        int[] container = arrayRandom(5, 100);
        for (int i : container) {
            System.out.print(i + " ");
        }
    }
}
