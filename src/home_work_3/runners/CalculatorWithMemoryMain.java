package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

/**
12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 посчитать выражения из задания 1.Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, вместо них необходимо использовать
 метод save, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения из памяти записанного значения. Пример:

 CalculatorWithOperator calcOperator = new CalculatorWithOperator();
 CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);
 calcMemory.division(28, 5);
 calcMemory.save();
 calcMemory.pow(calcMemory.load(), 2);
 calcMemory.save();
 calcMemory.addition(4.1, calcMemory.load());
 calcMemory.save();
 calcMemory.addition(calcMemory.load(), calcMemory.multiplication(15, 7));
 System.out.printf("%.2f%n", calcMemory.load()); // 140.46
 */

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calculatorWithMathCopy);
        calcMemory.getDivision(28, 5);
        calcMemory.save();
        calcMemory.getPowerOfNumber(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.getAddition(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.getAddition(calcMemory.load(), calcMemory.getMultiplicatin(15, 7));
        calcMemory.save();
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f", calcMemory.load());
    }
}
