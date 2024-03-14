package home_work_3.calcs.simple;

/*
 * 3. Создать класс CalculatorWithMathCopy.
 *	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 *	3.2 В классе должны присутствовать математические методы:
 *		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 *		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны содержать
 *		в своём теле вызов библиотеки Math и возврат полученного результата.
 *	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора
 *	    и используя методы из данного экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод получения результата деления одного числа на второе
     * @param x делимое
     * @param y делитель
     * @return результат деления (частное)
     */
    public double getDivision(double x, double y) {
        return x / y;
    }

    /**
     * Метод получения результата умножения одного числа на второе
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    public double getMultiplicatin(double x, double y) {
        return x * y;
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    public double getSubtruction(double x, double y) {
        return x - y;
    }

    /**
     * Метод получения суммы двух чисел
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        return x + y;
    }

    /**
     * Метод возведение в целую степень дробного положительного числа, используя библиотеку Math
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
       if(x <= 0) {
           return -1;
       }
       return Math.pow(x, y);
    }

    /**
     * Метод нахождения модуля числа, используя библиотеку Math
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        return Math.abs(x);
    }

    /**
     * Метод нахождения квадратного корня,  используя библиотеку Math
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        return Math.sqrt(x);
    }
}
