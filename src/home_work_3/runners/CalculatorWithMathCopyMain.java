package home_work_3.runners;

/*
 * 3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 * и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorMath = new CalculatorWithMathCopy();

        double degree =  calculatorMath.getPowerOfNumber(calculatorMath.getDivision(28, 5), 2);
        double multiplication = calculatorMath.getMultiplicatin(15, 7);
        double result = calculatorMath.getAddition(calculatorMath.getAddition(4.1, multiplication), degree);

        System.out.println("Результат вычисления 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
