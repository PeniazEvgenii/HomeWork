package home_work_3.runners;

/*
 * 4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 *  и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorExtends = new CalculatorWithMathExtends();

        double resultDegree =  calculatorExtends.getPowerOfNumber(calculatorExtends.getDivision(28, 5), 2);
        double resultMultiplication = calculatorExtends.getMultiplicatin(15, 7);
        double result = calculatorExtends.getAddition(calculatorExtends.getAddition(4.1, resultMultiplication), resultDegree);

        System.out.println("Результат вычисления 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
