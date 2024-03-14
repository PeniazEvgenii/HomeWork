package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
 * 	9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод). В main методе требуется:
 * 		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя методы из данного экземпляра посчитать выражения из задания 1.
 *  Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя методы из данного экземпляра посчитать выражения из задания 1.
 *  Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 * 		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и используя методы из данного экземпляра посчитать выражения из задания 1.
 *  Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorExtends = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calculatorAutoChoice1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorOperator);
        CalculatorWithCounterAutoChoiceAgregation calculatorAutoChoice2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorMathCopy);
        CalculatorWithCounterAutoChoiceAgregation calculatorAutoChoice3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorExtends);

        CalculatorWithCounterAutoChoiceAgregation[] calculatorAutoChoiceArray = {calculatorAutoChoice1, calculatorAutoChoice2, calculatorAutoChoice3};
        for (CalculatorWithCounterAutoChoiceAgregation calculatorChoice : calculatorAutoChoiceArray) {
            double resultCaclChoice = getResultExpression(calculatorChoice);
            printResultExpression(resultCaclChoice, calculatorChoice);
        }
    }

    /**
     * Метод для вычисления выражения 4.1 + 15 * 7 + (28 / 5) ^ 2
     * @param calculatorAuto объект класса CalculatorWithCounterAutoChoiceAgregation
     * @return результат выражения
     */
    public static double getResultExpression(CalculatorWithCounterAutoChoiceAgregation calculatorAuto) {
        double resultMultiplication = calculatorAuto.getMultiplicatin(15, 7);
        double resultDivision = calculatorAuto.getDivision(28, 5);
        double resultDegree = calculatorAuto.getPowerOfNumber(resultDivision, 2);
        double resultSum = calculatorAuto.getAddition(4.1, resultMultiplication);
        return calculatorAuto.getAddition(resultSum, resultDegree);
    }

    /**
     * Метод печати результата выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 и количество выполненных операций операций
     * @param result результат вычисления выражения
     * @param calculatorAuto объект класса CalculatorWithCounterAutoChoiceAgregation
     */
    public static void printResultExpression(double result, CalculatorWithCounterAutoChoiceAgregation calculatorAuto) {
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f. Количество операций = %d %n", result, calculatorAuto.getCountOperation());
    }
}
