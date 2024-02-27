package home_work_2.arrays;

/*
 * 2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while, while, for, foreach.
 *  Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
 *  Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
 *		2.2.1. Вывести все элементы в консоль.
 *		2.2.2. Вывести каждый второй элемент массива в консоль.
 *		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    public static void main(String[] args) {
        getArrayConsole();
        getEachSecond();
        getReverseArray();
    }

    public static void getArrayConsole () {
        int[] array = arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int index = 0;
        while (index < array.length) {
            System.out.print(array[index] + " ");
            index++;
        }

        System.out.println();

        index = 0;
        do {
            System.out.print(array[index] + " ");
            index++;
        } while (index < array.length);
    }


    public static void getEachSecond (){
        int[] array = arrayFromConsole();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        int index = 0;
        for (int i : array) {
            if (index % 2 != 0){
                System.out.print(i + " ");
            }
            index++;
        }

        System.out.println();

        index = 0;
        while (index < array.length) {
            if (index % 2 != 0){
                System.out.print(array[index] + " ");
            }
            index++;
        }

        System.out.println();

        index = 0;
        do {
            if (index % 2 != 0) {
                System.out.print(array[index] + " ");
            }
            index++;
        } while (index < array.length);
    }


    public static void getReverseArray() {
        int[] array = arrayFromConsole();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        String temp ="";                         // подумать! что кроме строки можно !
        for (int i : array) {
            temp = i + " " + temp;
        }
        System.out.println(temp);

        int index = array.length - 1;
        while (index >= 0){
            System.out.print(array[index] + " ");
            index--;
        }

        System.out.println();

        index = array.length - 1;
        do {
            System.out.print(array[index] + " ");
            index--;
        } while (index >= 0);
    }
}
