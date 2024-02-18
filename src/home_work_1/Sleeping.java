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

    public static boolean sleepIn (boolean weekday, boolean vokation) {
        boolean rest = false;

        if (!weekday || vokation) {
            rest = true;
        }

        return rest;
    }
}
