package home_work_3.runners;

/*
 *  8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и
 * используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 *       4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregation calculatorAgregation = new CalculatorWithCounterAutoAgregation(calculatorWithOperator);

        double resultMultiplication = calculatorAgregation.getMultiplicatin(15, 7);
        double resultDivision = calculatorAgregation.getDivision(28, 5);
        double resultDegree = calculatorAgregation.getPowerOfNumber(resultDivision, 2);
        double resultSum = calculatorAgregation.getAddition(4.1, resultMultiplication);
        double result = calculatorAgregation.getAddition(resultSum, resultDegree);

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d", result, calculatorAgregation.getCountOperation());
    }
}
