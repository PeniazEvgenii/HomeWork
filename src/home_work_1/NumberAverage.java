package home_work_1;

import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите три различных числа");

        int firstNum = console.nextInt();
        int secondNum = console.nextInt();
        int thirdNum = console.nextInt();
        int avg;

        if (firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum) {
            System.out.println("Введены одинаковые числа. Запустите программу заново");
            System.exit(0);
        }

        if ((firstNum > secondNum && firstNum < thirdNum) || (firstNum < secondNum && firstNum > thirdNum)) {
            avg = firstNum;
        } else if ((secondNum > firstNum && secondNum < thirdNum) || (secondNum > thirdNum && secondNum <firstNum)) {
            avg = secondNum;
        } else {
            avg = thirdNum;
        }

        System.out.println("Среднее число: " + avg);
    }
}
