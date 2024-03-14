package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
 * 1.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main методе требуется создать
 *   экземпляр калькулятора и используя методы из данного экземпляра  посчитать выражения из задания 1. Вывести в консоль результаты посчитанных 
 *   выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calculator2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculator3 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoAgregationInterface calculatorAgregInterface1 = new CalculatorWithCounterAutoAgregationInterface(calculator1);
        CalculatorWithCounterAutoAgregationInterface calculatorAgregInterface2 = new CalculatorWithCounterAutoAgregationInterface(calculator2);
        CalculatorWithCounterAutoAgregationInterface calculatorAgregInterface3 = new CalculatorWithCounterAutoAgregationInterface(calculator3);

        CalculatorWithCounterAutoAgregationInterface[] calculatorInterface = {calculatorAgregInterface1, calculatorAgregInterface2, calculatorAgregInterface3};
        for (CalculatorWithCounterAutoAgregationInterface calculatorAuto : calculatorInterface) {
            double result = getResultExpression(calculatorAuto);
            printResultExpression(result, calculatorAuto);
        }
    }

    /**
     * Метод для вычисления выражения 4.1 + 15 * 7 + (28 / 5) ^ 2
     * @param calculatorAuto объект класса CalculatorWithCounterAutoAgregationInterface
     * @return результат выражения
     */
    public static double getResultExpression(CalculatorWithCounterAutoAgregationInterface calculatorAuto) {
        double resultMultiplication = calculatorAuto.getMultiplicatin(15, 7);
        double resultDivision = calculatorAuto.getDivision(28, 5);
        double resultDegree = calculatorAuto.getPowerOfNumber(resultDivision, 2);
        double resultSum = calculatorAuto.getAddition(4.1, resultMultiplication);
        return calculatorAuto.getAddition(resultSum, resultDegree);
    }

    /**
     * Метод печати результата выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 и количество выполненных операций операций
     * @param result результат вычисления выражения
     * @param calculatorInterface объект класса CalculatorWithCounterAutoAgregationInterface
     */
    public static void printResultExpression(double result, CalculatorWithCounterAutoAgregationInterface calculatorInterface) {
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d %n", result, calculatorInterface.getCountOperation());
    }

}
