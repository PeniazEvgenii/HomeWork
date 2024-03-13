package home_work_3.runners;
/* 6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя
 *     методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorSuper = new CalculatorWithCounterAutoSuper();

        double resultMultiplication = calculatorSuper.getMultiplicatin(15, 7);
        double resultDivision = calculatorSuper.getDivision(28, 5);
        double resultDegree = calculatorSuper.getPowerOfNumber(resultDivision, 2);
        double resultSum = calculatorSuper.getAddition(4.1, resultMultiplication);
        double result = calculatorSuper.getAddition(resultSum, resultDegree);

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d", result, calculatorSuper.getCountOperation());

    }

}
