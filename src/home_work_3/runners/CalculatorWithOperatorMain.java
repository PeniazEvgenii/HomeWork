package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/*
2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр
калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double degree =  calculator.getPowerOfNumber(calculator.getDivision(28, 5), 2);
        double multiplication = calculator.getMultiplicatin(15, 7);
        double result = calculator.getAddition(calculator.getAddition(4.1, multiplication), degree);
        System.out.println(calculator.getSquareRoot(101));

        System.out.println("Результат вычисления 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
