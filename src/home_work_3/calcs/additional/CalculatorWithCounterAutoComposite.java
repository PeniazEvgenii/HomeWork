package home_work_3.calcs.additional;
/*
 * 7. Создать класс CalculatorWithCounterAutoComposite.
 *   7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 *   7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
 *   7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
 *   7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который сохранён в его поле.
 *   7.5 В классах должны присутствовать математические методы:
 *   	7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 *   	7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 *   7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 *   7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 *        посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    private long countOperation;

    /**
     *  Метод для получения количества использований калькулятора
     * @return количество использований калькулятора
     */
   public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод получения результата деления одного числа на второе
     * Математика реализована в методе {@link CalculatorWithMathCopy#getDivision(double x, double y)}
     * @param x делимое
     * @param y делитель
     * @return результат деления (частное)
     */
    public double getDivision(double x, double y) {
        countOperation++;
        return calculator.getDivision(x, y);
    }

    /**
     * Метод получения результата умножения одного числа на второе
     * Математика реализована в методе {@link CalculatorWithMathCopy#getMultiplicatin(double x, double y)}
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    public double getMultiplicatin(double x, double y) {
        countOperation++;
        return calculator.getMultiplicatin(x, y);
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * Математика реализована в методе {@link CalculatorWithMathCopy#getSubtruction(double x, double y)}
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    public double getSubtruction(double x, double y) {
        countOperation++;
        return calculator.getSubtruction(x, y);
    }

    /**
     * Метод получения суммы двух чисел
     * Математика реализована в методе {@link CalculatorWithMathCopy#getAddition(double x, double y)}
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        countOperation++;
        return calculator.getAddition(x, y);
    }

    /**
     * Метод возведение в целую степень дробного положительного числа
     * Математика реализована в методе {@link CalculatorWithMathCopy#getPowerOfNumber(double x, int y)}
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
       countOperation++;
       return calculator.getPowerOfNumber(x, y);
    }

    /**
     * Метод нахождения модуля числа
     * Математика реализована в методе {@link CalculatorWithMathCopy#getModuleOfNumber(double x)}
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        countOperation++;
        return calculator.getModuleOfNumber(x);
    }

    /**
     * Метод нахождения квадратного корня
     * Математика реализована в методе {@link CalculatorWithMathCopy#getSquareRoot(double x)}
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        countOperation++;
        return calculator.getSquareRoot(x);
    }

}
