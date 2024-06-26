package home_work_2.loops;

import java.beans.PropertyEditorSupport;
import java.util.Locale;
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
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введи число, которое нужно возвести в степень. Ввод вещественных через запятую");
        double number = console.nextDouble();
        int inputDegree;
        boolean checkMinDegree;

        do {
            System.out.println("Введи степень, в которую нужно возвести в число");
            inputDegree = console.nextInt();
            checkMinDegree = inputDegree < MIN_INPUT_DEGREE;

            if (checkMinDegree) {
                System.out.println("Ошибка! Введи значение степени от " + MIN_INPUT_DEGREE + " и выше");
            }
        } while (checkMinDegree);

        double result = getPowerOfNumber(number, inputDegree);
        System.out.println(number + " ^ " + inputDegree + " = " + result);
    }

    /**
     * Метод возведение числа в целую положительную степень
     * @param number число, возводимое в степень
     * @param inputDegree степень
     * @return результат возведения в степень
     */
    public static double getPowerOfNumber(double number, int inputDegree) {
        if(inputDegree == 0){
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= inputDegree; i++) {
            result *= number;
        }
        return result;
    }
}
