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

        String minElements = getMinTwoElements(array);
        System.out.println("Два наименьших элемента массива " + minElements);

        String minElements2 = getMinTwoElements2(array);                          //второй вариант Taskcode.ru
        System.out.println("Два наименьших элемента массива " + minElements2);

        String squeeze = toSqueezeArray(array, 10, 50);
        System.out.println("Результат сжатия массива: "  + squeeze);

        int sumDigitArray = getSumDigitArray(array);
        System.out.println("Сумма цифр массива = " + sumDigitArray);
    }

    /**
     * Метод получения суммы четных положительных элементов массива
     * @param array массив
     * @return сумма четных положительных элементов
     */
    public static int getSumEvenPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    /**
     * Метод нахождения максимального из элементов массива с четными индексами
     * @param array массив
     * @return максимальный из элементов массива с четными индексами
     */
    public static int getMaxNumEvenIndex(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     *  Метод нахождения элементов массива, которые меньше среднего арифметического
     * @param array массив
     * @return строка с элементами меньше среднего
     */
    public static String getElementBeforeAverage(int[] array){
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;
        String elements = "";
        boolean first = true;
        for (int i : array) {
            if (i < average){
                if(first){
                    elements += i;
                    first = false;
                    continue;
                }
                elements += " " + i;
            }
        }
        return elements;
    }

    /**
     * Метод получения двух наименьших (минимальных) элемента массива
     * @param array массив
     * @return строка с двумя элементами, если длина массива меньше 2 - возвращает "-1"
     */
    public static String getMinTwoElements(int[] array){
        if(array.length < 2){
            return "-1";
        }
        int minFirst = array[0];
        int minSecond = array[0];
        int indexMinFirst = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minFirst){
                minFirst = array[i];
                indexMinFirst = i;
            }
        }
        if(indexMinFirst == 0){
            minSecond = array[1];
        }
        for (int i = 0; i < array.length; i++) {
            if(minSecond > array[i] && i != indexMinFirst) {
                minSecond = array[i];
            }
        }
        return minFirst + " " + minSecond;
    }

    /**
     * Метод получения двух минимальных элементов массива
     * @param array массив
     * @return строка с двумя минимальными элементами, если длина массива меньше 2 - возвращает "-1"
     */

    public static String getMinTwoElements2(int[] array){
        if(array.length < 2){
            return "-1";
        }
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


    /**
     * Метод для сжатия массива значений принадлежащие интервалу
     * @param array массив
     * @param a начало интервала
     * @param b конец интервала
     * @return строка с сжатым массивом. Если a < 0 или b < 0 или b < a возвращает -1
     */
    public static String toSqueezeArray(int[] array, int a, int b) {

        int[] arrayTemp = new int[array.length];
        System.arraycopy(array, 0, arrayTemp, 0, array.length);

        if (a < 0 || b < 0 || b < a) {
            return "-1";
        }
        int count = 0;
        for (int i = 0; i < arrayTemp.length - count; i++) {
            if(arrayTemp[i] >= a && arrayTemp[i] <= b) {
                for (int j = i; j < arrayTemp.length - 1; j++) {
                    arrayTemp[j] = arrayTemp[j + 1];
                }
                arrayTemp[arrayTemp.length - 1] = 0;
                i--;
                count++;
            }
        }
        boolean first = true;
        String result = "";
        for (int i : arrayTemp) {
            if(first){
                result += i;
                first = false;
                continue;
            }
            result += " " + i ;
        }
        return result;
    }

    /**
     * Метод расчета суммы цифр чисел массива
     * @param array массив
     * @return сумма цифр чисел массива
     */
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