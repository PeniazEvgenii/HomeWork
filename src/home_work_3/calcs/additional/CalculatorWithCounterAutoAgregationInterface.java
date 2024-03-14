package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/*
 * 11. Создать класс CalculatorWithCounterAutoAgregationInterface.
 * 	11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам пользователь вашего класса.
 * 	11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 * 	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 	11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 	11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
 *  посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calculator;
    private long countOperation;

    /**
     * Конструктор с одним параметром
     * @param calculator объект типа ICalculator
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     *  Метод для получения количества использований калькулятора
     * @return количество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод получения результата деления одного числа на второе
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
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        countOperation++;
        return calculator.getAddition(x, y);
    }

    /**
     * Метод возведение в целую степень дробного положительного числа.
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
        countOperation++;
        return calculator.getPowerOfNumber(x, y);
    }

    /**
     * Метод нахождения модуля числа.
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        countOperation++;
        return calculator.getModuleOfNumber(x);
    }

    /**
     * Метод нахождения квадратного корня.
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        countOperation++;
        return calculator.getSquareRoot(x);
    }
}
