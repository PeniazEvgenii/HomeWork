package home_work_2.arrays;

/*
 * 2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
 *   Все задачи в одном классе, в отдельных методах. Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
 *		2.4.1. Сумма четных положительных элементов массива
 *		2.4.2. Максимальный из элементов массива с четными индексами
 *		2.4.3. Элементы массива, которые меньше среднего арифметического
 *		2.4.4. Найти два наименьших (минимальных) элемента массива
 *		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
 *		2.4.6. Сумма цифр массива
 */

import java.util.ArrayList;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Task2_4 {
    public static void main(String[] args) {
        int[] array = arrayRandom(50, 100);
        System.out.println("Рандомный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int sumEvenPositive = getSumEvenPositive(array);
        System.out.println("Сумма четных положительных элементов массива = " + sumEvenPositive);

        int MaxEven = getMaxNumEvenIndex(array);
        System.out.println("Максимальный из элементов массива с четными индексами = " + MaxEven);

        String elements = getElementBeforeAverage(array);
        System.out.println("Элементы меньше среднего арифметического: " + elements);

      // char[] test = elements.toCharArray();
      // for (char c : test) {
      //     System.out.print(c + " ");
      // }
      // System.out.println();

      // String[] elementsnew = elements.split(" ");    //тестики
      // for (String s : elementsnew) {
      //     System.out.print(s + " ");
      // }

        String minElements = getMinTwoElements(array);
        System.out.println("Два наименьших элемента массива " + minElements);

        String minElements2 = getMinTwoElements2(array);                          //второй вариант Taskcode.ru
        System.out.println("Два наименьших элемента массива " + minElements2);

        String squeeze = toSqueezeArray(array, 10, 50);
        System.out.println("Результат сжатия массива: "  + squeeze);

        int sumDigitArray = getSumDigitArray(array);
        System.out.println("Сумма цифр массива = " + sumDigitArray);
    }


    public static int getSumEvenPositive (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static int getMaxNumEvenIndex (int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static String getElementBeforeAverage (int[] array){
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;
        String elements = "";
        for (int i : array) {
            if (i < average){
                elements += i + " ";
            }
        }
        return elements;    //нашел ArrayList <Integer>
    }


    public static String getMinTwoElements (int[] array){
        int minFirst = array[0];
        int minSecond = array[0];
        int indexMinFirst = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minFirst){
                minFirst = array[i];
                indexMinFirst = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(minSecond > array[i] && i != indexMinFirst) {
                minSecond = array[i];
            }
        }
        return minFirst + " " + minSecond;    // подумать о массиве?
    }


    public static String getMinTwoElements2 (int[] array){
        int indexMinFirst;
        int indexMinSecond;

        if (array[1] > array[0]) {
            indexMinFirst = 0;
            indexMinSecond = 1;
        } else {
            indexMinFirst = 1;
            indexMinSecond = 0;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[indexMinFirst]){
                if(array[indexMinFirst] < array[indexMinSecond]){
                    indexMinSecond = indexMinFirst;
                }
                indexMinFirst = i;
            } else {
                if (array[i] < array[indexMinSecond]) {
                    indexMinSecond = i;
                }
            }
        }

        return array[indexMinFirst] + " " + array[indexMinSecond];
    }


    public static String toSqueezeArray(int[] array, int a, int b) {  // может логичнее вывод и в массив

        int[] arrayTemp = new int[array.length];                       //испортил без копии array.
        System.arraycopy(array, 0, arrayTemp, 0, array.length);

        if (a < 0 || b < 0 || b < a) {
            System.out.println("Введены некорректные данные начала и конца границы массива");
            System.exit(1);
        }

        for (int i = 0; i < arrayTemp.length; i++) {
            if(arrayTemp[i] >= a && arrayTemp[i] <= b) {
                for (int j = i; j < arrayTemp.length - 1; j++) {
                    arrayTemp[j] = arrayTemp[j + 1];
                }
                arrayTemp[arrayTemp.length - 1] = 0;
                i--;
            }
        }

        String result = "";
        for (int i : arrayTemp) {
            result += i + " ";
        }
        return result;
    }


    public static int getSumDigitArray(int[] array) {
        int sumDigit = 0;

        for (int i = 0; i < array.length; i++) {
           int temp = array[i];
            while (temp > 0) {
                sumDigit += temp % 10;
                temp /= 10;
            }
        }
        return sumDigit;
    }
}