package home_work_1;

import java.util.Scanner;

public class NumberDivision {
    public static Scanner console = new Scanner(System.in); // непонятно, что объект console виден ? в других классах. без static в static методах не виден
    // к статичным переменным можно обр без создания объекта. static переменная одна для всех объектов класса
    public static void main(String[] args) {
        System.out.println("Введи делимое число");
        int firstNum = getCheckInt();
        System.out.println("Введи делитель");
        int secondNum = getCheckInt();

        if (secondNum == 0) {
            System.out.println("Деление на ноль. Запусти программу заново");
            System.exit(0);
        }

        if (firstNum % secondNum == 0) {
            System.out.println(firstNum + " делиться на " + secondNum);
            System.out.println("Результат деления: частное = " + firstNum / secondNum);
        } else {
            System.out.println(firstNum + " не делиться на " + secondNum);
            System.out.println("Результат деления: частное = " + firstNum / secondNum + ", остаток " + firstNum % secondNum);
        }
    }

    public static int getCheckInt () {
        int temp;

        if (console.hasNextInt()) {
            temp = console.nextInt();
        } else {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз");
            console.next();  // без метода next произошло зацикливание next считывает строку до перого пробела
            temp = getCheckInt();
        }

        return temp;
    }
}
