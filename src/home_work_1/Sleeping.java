package home_work_1;

import java.util.Scanner;

public class Sleeping {
    public static void main(String[] args) {
        boolean result = sleepIn(true,false);

        if (result) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Вставай и иди на работу!");
        }
    }

    /**
     * Метод определения необходимости идти на работу
     * @param weekday true - если рабочий, false - если выходной
     * @param vokation true - если отпуск, false - если нет отпуска
     * @return true - неоходимо идти на работу, false - спим дальше
     */
    public static boolean sleepIn (boolean weekday, boolean vokation) {
        return !weekday || vokation;
    }
}
