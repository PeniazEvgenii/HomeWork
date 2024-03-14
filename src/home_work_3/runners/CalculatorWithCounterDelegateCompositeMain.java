package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
/*
 * 7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 * и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorComposite = new CalculatorWithCounterAutoComposite();

        double resultMultiplication = calculatorComposite.getMultiplicatin(15, 7);
        double resultDivision = calculatorComposite.getDivision(28, 5);
        double resultDegree = calculatorComposite.getPowerOfNumber(resultDivision, 2);
        double resultSum = calculatorComposite.getAddition(4.1, resultMultiplication);
        double result = calculatorComposite.getAddition(resultSum, resultDegree);

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d", result, calculatorComposite.getCountOperation());
    }
}
