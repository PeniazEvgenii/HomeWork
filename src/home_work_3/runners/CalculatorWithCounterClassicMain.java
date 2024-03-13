package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

/*
 * 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1, при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика. Вывести в консоль результат.
 * 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorClassic = new CalculatorWithCounterClassic();

        double resultMultiplication = calculatorClassic.getMultiplicatin(15, 7);
        calculatorClassic.incrementCountOperation();
        double resultDivision = calculatorClassic.getDivision(28, 5);
        calculatorClassic.incrementCountOperation();
        double resultDegree = calculatorClassic.getPowerOfNumber(resultDivision, 2);
        calculatorClassic.incrementCountOperation();
        double resultSum = calculatorClassic.getAddition(4.1, resultMultiplication);
        calculatorClassic.incrementCountOperation();
        double result = calculatorClassic.getAddition(resultSum, resultDegree);
        calculatorClassic.incrementCountOperation();

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d", result, calculatorClassic.getCountOperation());
    }
}
