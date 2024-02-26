package home_work_2.utils;

/*
 * 4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 *    4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему массив
 *           при помощи алгоритма пузырьковая сортировка. Описание алгоритма: https://prog-cpp.ru/sort-bubble/
 *    4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему массив при
 *           помощи алгоритма шейкерная сортировка. Описание алгоритма: https://prog-cpp.ru/sort-shaker/
 */

import java.util.Random;

public class SortsUtils {

    public static void sort(int[] arr){                        //не забыть удалить счетчик проходов и массив в main
        int temp1=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                temp1++;
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Количество проходов " + temp1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[50];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(array);
    }
}
