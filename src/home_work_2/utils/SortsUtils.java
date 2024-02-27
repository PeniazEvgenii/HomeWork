package home_work_2.utils;

/*
 * 4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 *    4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему массив
 *           при помощи алгоритма пузырьковая сортировка. Описание алгоритма: https://prog-cpp.ru/sort-bubble/
 *    4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему массив при
 *           помощи алгоритма шейкерная сортировка. Описание алгоритма: https://prog-cpp.ru/sort-shaker/
 */


public class SortsUtils {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int flag = 1;
        while (left < right && flag != 0){
            flag = 0;
            for (int i = left; i < right; i++) {
                if(arr[i] > arr[i + 1]){
                    int tempRight = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempRight;
                    flag = 1;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if(arr[i] < arr [i - 1]){
                    int tempLeft = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tempLeft;
                    flag = 1;
                }
            }
            left++;
        }
    }

}
