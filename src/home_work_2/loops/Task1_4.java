package home_work_2.loops;
/*
 * Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до
 * переполнения и после переполнения. Умножать на:
 *   	1.4.1. 3
 *   	1.4.2. 188
 *   	1.4.3. -19
 *      1.4.4. Да и вообще на любое целочисленное
 */

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int value;

        do {
            System.out.println("Введи целочисленное число");

            if (console.hasNextInt()){
                value = console.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не целое число");
                 console.next();
            }
        } while(true);


        long resultBefore = getNumberBeforeOverflow(value);
        System.out.println("Значение до переполнения: " + resultBefore);
        System.out.println("Значение после переполнения: " + resultBefore * value);
    }

    /**
     * Метод для поиска значение до переполнения при умножении 1 на число
     * @param value умножаемое число
     * @return значение до переполнения
     */
    public static long getNumberBeforeOverflow(int value){
        long a = 1;
        long tempResult;
        while (true){
            tempResult = a;
            a = a * value;
            if (tempResult != (a / value)) {
                break;
            }
        }
        return tempResult;
    }
}
