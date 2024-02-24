package home_work_2.loops;

import java.util.Scanner;

/*
 * 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
 *  Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 *  Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 *		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 *		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

public class Task1_3 {
    public static final int MIN_INPUT_DEGREE = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи число, которое нужно возвести в степень");
        double number = console.nextDouble();
        int inputDegree;
        boolean checkMinDegree;

        do {
            System.out.println("Введи степень, в которую нужно возвести в число");
            inputDegree = console.nextInt();                          // ввод в консоль через запятую
            checkMinDegree = inputDegree < MIN_INPUT_DEGREE;

            if (checkMinDegree) {
                System.out.println("Ошибка! Введи значение степени от " + MIN_INPUT_DEGREE + " и выше");
            }

        } while (checkMinDegree);

        int current = inputDegree;
        double result = 1;


        while (current > 0) {
            result *= number;
            current--;
        }

        System.out.println(number + " ^ " + inputDegree + " = " + result);
    }
}
